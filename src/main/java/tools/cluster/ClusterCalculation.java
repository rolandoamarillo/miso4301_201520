package tools.cluster;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import edu.uci.ics.jung.algorithms.cluster.EdgeBetweennessClusterer;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;

public class ClusterCalculation {

	public ClusterCalculation(){
		
	}
	
	public void clusteringAlgorithm(
			ArrayList<AbstractCodeRelation> neighRelations) {

		Graph<ClassUnit, AbstractCodeRelation> grp = new SparseMultigraph<ClassUnit, AbstractCodeRelation>();
		MigrationCluster mc = modelMigFactory.createMigrationCluster();
		mc.setName("Table Betweeness Clusterer");
		//Las formas se colocan como vertices del grafo
		for (ClassUnit frm : root.getClassUnit()) {
			grp.addVertex(frm);
		}
		
		//Los MigrationElementRelation son los conectores entre los vertices
		for (AbastractCodeRelationRelation mg : neighRelations) {

			grp.addEdge(mg, (ClassUnit) mg.getSrcElement(),
					(ClassUnit) mg.getDestElement());
		}

		// VoltageClusterer<Form, MigrationElementRelation> vcl= new
		// VoltageClusterer<Form, MigrationElementRelation>(grp, 10);
		EdgeBetweennessClusterer<ClasUnit, AbstractCodeRelation> clusterer = 
				new EdgeBetweennessClusterer<ClassUnit, AbstractCodeRelation>(
				neighRelations.size() / 8);
		Set<Set<ClassUnit>> clusterSet = clusterer.transform(grp);
		//System.out.println("NCL> " + clusterSet.size());
		//Para almacenar formas de control
		ArrayList<ClassUnit> ctrlClassUnit = new ArrayList<ClassUnit>();
		//Para almacenar formas aisladas (no se relacionan con otras formas)
		ArrayList<ClassUnit> isoClassUnit = new ArrayList<ClassUnit>();

		int clWeight = 0;
		//Set<String> stiso = new HashSet<String>();
		int clusterId = 1;
		for (Set<ClassUnit> set : clusterSet) {
			if (set.size() > 1) {
				//System.out.println("++++CLUSTER++++++");
				FunctionalGroup fg = modelMigFactory.createFunctionalGroup();
				//Set<String> st = new HashSet<String>();
				
				//Cada una de las formas se a�ade al grupo funcional
				for (ClassUnit classUnit : set) {
					fg.getElements().add(classUnit);
					//System.out.println("   --->" + form.getName());
					//st.addAll(formTables.get(classUnit.getName()));

				}

				clWeight = clWeight < set.size() ? set.size() : clWeight;

				// String tx = " - ";

				/*for (String master : st) {
					// tx += string + " - ";
					for (String detail : st) {
						// tx += string + " - ";
						MasterDetailRelation mdr = findMasterDetailRelation(
								master, detail);
						if (mdr != null) {
							fg.getElements().add(mdr);
						}

					}
				}*/

				/*for (String string : st) {
					// tx += string + " - ";
					//System.out.println("-----|||>" + dbObjects.get(string)						+ " - " + string);
					fg.getElements().add(dbObjects.get(string));

				}*/

				fg.setName("FC-" + clusterId);
				fg.setClWeight(set.size());
				mc.getMigrationGroups().add(fg);

				clusterId++;
			} /*else if (set.size() <= 1
					&& formTables.get(((Form) set.toArray()[0]).getName())
							.size() > 0) {

				//System.out.println("++++CLUSTER 1++++++");
				isoClassUnit.add((Form) set.toArray()[0]);
				stiso.addAll(formTables.get(((Form) set.toArray()[0]).getName()));

			} */else {
				ctrlClassUnit.add((ClassUnit) set.toArray()[0]);

			}

		}

		// Cluster Formas Control
		FunctionalGroup fg = modelMigFactory.createFunctionalGroup();
		fg.setName("FC-CTRL");
		for (ClassUnit classUnit : ctrlClassUnit) {
			fg.getElements().add(classUnit);
		}
		//clWeight = clWeight < ctrlClassUnit.size() ? ctrlClassUnit.size() : clWeight;
		fg.setClWeight(ctrlClassUnit.size());
		mc.getMigrationGroups().add(fg);

		// Cluster Formas Aisladas (NO Agrupadas)

		FunctionalGroup fgi = modelMigFactory.createFunctionalGroup();
		fgi.setName("FC-ISOL");
		for (ClassUnit classUnit : isoClassUnit) {
			fgi.getElements().add(classUnit);
		}

	/*	for (String master : stiso) {
			// tx += string + " - ";
			for (String detail : stiso) {
				// tx += string + " - ";
				MasterDetailRelation mdr = findMasterDetailRelation(master,
						detail);
				if (mdr != null) {
					fgi.getElements().add(mdr);
				}

			}
		}*/

		/*for (String string : stiso) {

			fgi.getElements().add(dbObjects.get(string));
		}*/

		//clWeight = clWeight < isoClassUnit.size() ? isoClassUnit.size() : clWeight;
		fgi.setClWeight(isoClassUnit.size());
		mc.getMigrationGroups().add(fgi);
		mc.setMaxClusterSize(clWeight);
		root.getAppInfo().getMigrationClusters().add(mc);
		// List<Form> edges = clusterer.getEdgesRemoved();

	}
}
