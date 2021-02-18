package fstt.lsi;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import fstt.lsi.Entitie.Activite;
import fstt.lsi.Entitie.Categorie;
import fstt.lsi.Entitie.Mouvement;
import fstt.lsi.Entitie.User;
import fstt.lsi.Repository.ActiviteRepository;
import fstt.lsi.Repository.CategorieRepository;
import fstt.lsi.Repository.MouvementRepository;
import fstt.lsi.Repository.UserRepository;

@SpringBootApplication

public class JeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JeeProjectApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(UserRepository userRepository, CategorieRepository categorieRepository, ActiviteRepository activiteRepository, MouvementRepository mouvementRepository ) {
		return args->{
			userRepository.deleteAll();
			userRepository.save(new User("user1","12345678", 60, 1.3));
			
			
			categorieRepository.deleteAll();
				categorieRepository.save(new Categorie("C1",
						"jambes",
						"Des jambes bien entraînées, c'est également une stabilité et un équilibre supérieur. Vous aurez un meilleur contrôle du corps lors de tâches du quotidien, mais également si vous pratiquez la danse ou des arts martiaux, disciplines où ces qualités sont essentielles.",
						new ArrayList<>()));
				
				categorieRepository.save(new Categorie("C2",
						"La sangle abdominale",
						"Les muscles abdominaux aident aussi dans la digestion et participent à un bon fonctionnement intestinal "
						+ "et améliorent le transit. En effet, la sangle abdominale prodigue des massages aux organes, ce qui stimule"
						+ " la paroi intestinale. Ainsi avoir des abdominaux toniques (mais pas trop) permet de maintenir un confort "
						+ "digestif et de lutter contre les ballonnements et la constipation. Mais ce n’est pas sa seule fonctionnalité,"
						+ " avoir des abdos solides, c’est avoir une pression intra abdominale qualitative, ce qui est bien utile aux"
						+ " toilettes ou encore… lors de l’accouchement.",
						new ArrayList<>()));
				
				categorieRepository.save(new Categorie("C3",
						"les bras et les épaules",
						"Il n'y a pas que les pectoraux et les abdominaux dans la vie. Un corps harmonieux passe aussi par des bras bien proportionnés.",
						new ArrayList<>()));
				
			activiteRepository.deleteAll();
			Categorie C1 = categorieRepository.findById("C1").get();
			activiteRepository.save(new Activite("A1",
					"Niveau: débutant",
					"10min",
					C1,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A2",
					"Niveau: Moyenne",
					"15min",
					C1,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A3",
					"Niveau: Haut",
					"20min",
					C1,
					new ArrayList<>()
					));
			
			Categorie C2 = categorieRepository.findById("C2").get();
			activiteRepository.save(new Activite("A4",
					"Niveau: débutant",
					"10min",
					C2,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A5",
					"Niveau: Moyenne",
					"15min",
					C2,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A6",
					"Niveau: Haut",
					"20min",
					C2,
					new ArrayList<>()
					));
			
			Categorie C3 = categorieRepository.findById("C3").get();
			activiteRepository.save(new Activite("A7",
					"Niveau: débutant",
					"10min",
					C3,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A8",
					"Niveau: Moyenne",
					"15min",
					C3,
					new ArrayList<>()
					));
			
			activiteRepository.save(new Activite("A9",
					"Niveau: Haut",
					"20min",
					C3,
					new ArrayList<>()
					));
			
			mouvementRepository.deleteAll();
			Activite A1 = activiteRepository.findById("A1").get();
			mouvementRepository.save(new Mouvement("Les fentes",
					"Muscles les plus sollicités: les cuisses et les fesses"
					+ "1-Debout, dos droit, pieds écartés."
					+ "2-Avancez la jambe gauche loin devant et fléchissez vos genoux de façon à former deux angles droits. "
					+ "Le genou arrière ne touche pas le sol, et le genou avant ne doit pas dépasser votre pointe de pied.Puis, alternez.",
					"5",
					A1));
			
			mouvementRepository.save(new Mouvement("les squats",
                    "Muscule les plus sollicités: cuisses et fesses "
                    + "1-Commencez debout, jambesécartées de la largeur du bassin, bras le long du corps."
                    + "2-Baissez-vous le plus bas possible en fléchissant les jambes et en poussant vos fesses lion en arrière, tout en remontant vos bras tendus devant vous."
                    + " Attention à ne surtout pas avancer les genoux:ceux-ci ne doivent pas dépasser la pointe de vos orteils.Revenez ensuite à la position initiale, "
                    + "en contractant les fessiers.",
					"5",
					A1));
			
			mouvementRepository.save(new Mouvement("les relevés de bassin",
                    "Muscles les plus sollicités: les fesses et les abdominaux"
                    + "1-Allongez-vous sur le dos, bras le long du corps, jambes pliées, pieds posés près des fesses et écartés de la largeur les épaules."
                    + "2-Sur l'expiration, relevez le bassin en contractant vos fessiers et vos abdos(ventre rentré), tout en gardant le haut du dos collé au sol."
                    + "Votre axe genoux-bassin-épaules doit former une ligne droite."
                    + "Maintenez la position quelques secondes, puis redescendez doucement en inspirant. Remontez sans reposer le bassin au sol."
                    + "Pour solliciter davantage vos cuisses et vos fessiers, vous pouvez également lever une jambe et la maintenir tendue dans l'alignement de votre corps, "
                    + "loresque votre bassin est relevé. Changez de jambe en maintenant le bassin relevé.",
					"5",
					A1));
			
			
			Activite A2 = activiteRepository.findById("A2").get();
			mouvementRepository.save(new Mouvement("Les fentes",
					"Muscles les plus sollicités: les cuisses et les fesses"
					+ "1-Debout, dos droit, pieds écartés."
					+ "2-Avancez la jambe gauche loin devant et fléchissez vos genoux de façon à former deux angles droits. "
					+ "Le genou arrière ne touche pas le sol, et le genou avant ne doit pas dépasser votre pointe de pied."
					+ "Puis, alternez.",
					"10",
					A2));
			
			mouvementRepository.save(new Mouvement("les squats",
					 "Muscule les plus sollicités: cuisses et fesses "
			                    + "1-Commencez debout, jambesécartées de la largeur du bassin, bras le long du corps."
			                    + "2-Baissez-vous le plus bas possible en fléchissant les jambes et en poussant vos fesses lion en arrière, tout en remontant vos bras tendus devant vous."
			                    + " Attention à ne surtout pas avancer les genoux:ceux-ci ne doivent pas dépasser la pointe de vos orteils.Revenez ensuite à la position initiale, "
			                    + "en contractant les fessiers.",
					"10",
					A2));
			
			mouvementRepository.save(new Mouvement("les relevés de bassin",
					"Muscles les plus sollicités: les fesses et les abdominaux"
					+ " 1-Allongez-vous sur le dos, bras le long du corps, jambes pliées, pieds posés près des fesses et écartés de la largeur les épaules."
					+ "2-Sur l'expiration, relevez le bassin en contractant vos fessiers et vos abdos(ventre rentré), tout en gardant le haut du dos collé au sol. "
					+ "Votre axe genoux-bassin-épaules doit former une ligne droite."
					+ "Maintenez la position quelques secondes, puis redescendez doucement en inspirant. Remontez sans reposer le bassin au sol."
					+ "Pour solliciter davantage vos cuisses et vos fessiers, vous pouvez également lever une jambe et la maintenir tendue dans l'alignement de votre corps, "
					+ "loresque votre bassin est relevé. Changez de jambe en maintenant le bassin relevé.",
					"5",
					A2));
			
			
			Activite A3 = activiteRepository.findById("A3").get();
			mouvementRepository.save(new Mouvement("Les fentes",
					"Muscles les plus sollicités: les cuisses et les fesses"
					+ "1-Debout, dos droit, pieds écartés."
					+ "2-Avancez la jambe gauche loin devant et fléchissez vos genoux de façon à former deux angles droits. "
					+ "Le genou arrière ne touche pas le sol, et le genou avant ne doit pas dépasser votre pointe de pied."
					+ "Puis, alternez.",
					"15",
					A3));
			
			mouvementRepository.save(new Mouvement("les squats",
					 "Muscule les plus sollicités: cuisses et fesses "
			                    + "1-Commencez debout, jambesécartées de la largeur du bassin, bras le long du corps."
			                    + "2-Baissez-vous le plus bas possible en fléchissant les jambes et en poussant vos fesses lion en arrière, tout en remontant vos bras tendus devant vous."
			                    + " Attention à ne surtout pas avancer les genoux:ceux-ci ne doivent pas dépasser la pointe de vos orteils.Revenez ensuite à la position initiale, "
			                    + "en contractant les fessiers.",
					"10",
					A3));
			
			mouvementRepository.save(new Mouvement("Levées et fléchissements de jambes",
                        "Muscules les plus sollicités: les fessiers et les muscles des jambes "
                        + "Couché(e) sur les cotés,en appui sur le coude et adossé(e) à un mur, votre main su dessus prend appui sue le sol devant votre "
                        + "torse/poitrine pour maintenir votre équilibre.Fléchissez la hanche et le genou de la jambe au dessous à 90 degrés et rendez la jambe "
                        + "au dessus dans le prolongement du tronc.Levez la jambe du dessus et redescendez-la.Enchainez en fléchissant le genou vers la poitrine et "
                        + "revenez à la position initiale. Pendant l'exercice, gardez le bras du dos appuyé au mur, cet exercice peut etre pratiqué par les femmes enceintes.",
					"10",
					A3));
			
			
			Activite A4 = activiteRepository.findById("A4").get();
			mouvementRepository.save(new Mouvement("La planche",
                        "Muscles les plus sollicités: le transverse et le grand droit(abdominaux)"
                        + "A l'horizontale, soulevez le bassin et mettez-vous en appui sur vos avant-bras et vos pointes de pied. Vos coudes doivent être positionnés sous vos épaules et vos mains pointent vers l'avant."
                        + "Formez une planche rectiligne avec votre corps en serrant les fessiers et en rentrant le ventre pour contracter les abdos."
                        + "Votre dos est bien droit, vos jambes tendues, votre nuque étirée."
                        + "Tenez la position le plus longtemps possible.",
                        "5",
					    A4));
			
			mouvementRepository.save(new Mouvement("flexions-rotations du buste",
                          "Muscles les plus sollicités: les obliques(abdominaux)"
                          + " 1-Allongez-vous sur le dos, jambes fléchies, pieds à plat près des fessiers, mains derrière la tête. Décollez les épaules du sol en veillant à ne pas trop lever votre buste pour protéger votre dos."
                          + "2- Puis pivotez le buste de façon à ramener votre épaule droite devant votre genou gauche."
                          + "3- Revenez à la position initiale sans reposer la tête, puis alternez."
                          + "4-Décollez les épaules du sol et ramenez votre épaule ",
                          "5",
					     A4));
			
			mouvementRepository.save(new Mouvement("les pompes",
                          "Muscles les plus sollicités: les triceps et les pectoraux"
                          + "Allongez-vous à plat ventre et placez vos mains à plat sur le sol, un peu plus écartées que la largeur des épaules.Prenez appui sur vos pointes de pieds -ou sur vos genoux, si vous débutez - etsur l'expiration, "
                          + "1-relevez votre corps en tendant les bras.Veillez à garder les épaules au-dessus de vos mains,à gainer vos abdominaux et à rester bien droit. "
                          + "3-boire de l'eau."
                          + "2-sur l'inspiration,fléchessez les bras pour ramener le menton, la poitrine et les hanches vers le sol.",
                          "5",
					      A4));
			
			
			Activite A5 = activiteRepository.findById("A5").get();
			mouvementRepository.save(new Mouvement("La planche",
                        "Muscles les plus sollicités: le transverse et le grand droit(abdominaux)"
                        + "A l'horizontale, soulevez le bassin et mettez-vous en appui sur vos avant-bras et vos pointes de pied. Vos coudes doivent être positionnés sous vos épaules et vos mains pointent vers l'avant."
                        + "Formez une planche rectiligne avec votre corps en serrant les fessiers et en rentrant le ventre pour contracter les abdos."
                        + "Votre dos est bien droit, vos jambes tendues, votre nuque étirée."
                        + "Tenez la position le plus longtemps possible.",
                        "10",
					    A5));
			
			mouvementRepository.save(new Mouvement("flexions-rotations du buste",
                          "Muscles les plus sollicités: les obliques(abdominaux)"
                          + " 1-Allongez-vous sur le dos, jambes fléchies, pieds à plat près des fessiers, mains derrière la tête. Décollez les épaules du sol en veillant à ne pas trop lever votre buste pour protéger votre dos."
                          + "2- Puis pivotez le buste de façon à ramener votre épaule droite devant votre genou gauche."
                          + "3- Revenez à la position initiale sans reposer la tête, puis alternez."
                          + "4-Décollez les épaules du sol et ramenez votre épaule ",
                          "10",
					     A5));
			
			mouvementRepository.save(new Mouvement("les pompes",
                          "Muscles les plus sollicités: les triceps et les pectoraux"
                          + "Allongez-vous à plat ventre et placez vos mains à plat sur le sol, un peu plus écartées que la largeur des épaules.Prenez appui sur vos pointes de pieds -ou sur vos genoux, si vous débutez - etsur l'expiration, "
                          + "1-relevez votre corps en tendant les bras.Veillez à garder les épaules au-dessus de vos mains,à gainer vos abdominaux et à rester bien droit. "
                          + "3-boire de l'eau."
                          + "2-sur l'inspiration,fléchessez les bras pour ramener le menton, la poitrine et les hanches vers le sol.",
                          "10",
					      A5));
			
			
			Activite A6 = activiteRepository.findById("A6").get();
			mouvementRepository.save(new Mouvement("La planche",
                        "Muscles les plus sollicités: le transverse et le grand droit(abdominaux)"
                        + "A l'horizontale, soulevez le bassin et mettez-vous en appui sur vos avant-bras et vos pointes de pied. Vos coudes doivent être positionnés sous vos épaules et vos mains pointent vers l'avant."
                        + "Formez une planche rectiligne avec votre corps en serrant les fessiers et en rentrant le ventre pour contracter les abdos."
                        + "Votre dos est bien droit, vos jambes tendues, votre nuque étirée."
                        + "Tenez la position le plus longtemps possible.",
                        "10",
                        A6));
			
			mouvementRepository.save(new Mouvement("flexions-rotations du buste",
                          "Muscles les plus sollicités: les obliques(abdominaux)"
                          + " 1-Allongez-vous sur le dos, jambes fléchies, pieds à plat près des fessiers, mains derrière la tête. Décollez les épaules du sol en veillant à ne pas trop lever votre buste pour protéger votre dos."
                          + "2- Puis pivotez le buste de façon à ramener votre épaule droite devant votre genou gauche."
                          + "3- Revenez à la position initiale sans reposer la tête, puis alternez."
                          + "4-Décollez les épaules du sol et ramenez votre épaule ",
                          "15",
                          A6));
			
			mouvementRepository.save(new Mouvement("les pompes",
                          "Muscles les plus sollicités: les triceps et les pectoraux"
                          + "Allongez-vous à plat ventre et placez vos mains à plat sur le sol, un peu plus écartées que la largeur des épaules.Prenez appui sur vos pointes de pieds -ou sur vos genoux, si vous débutez - etsur l'expiration, "
                          + "1-relevez votre corps en tendant les bras.Veillez à garder les épaules au-dessus de vos mains,à gainer vos abdominaux et à rester bien droit. "
                          + "3-boire de l'eau."
                          + "2-sur l'inspiration,fléchessez les bras pour ramener le menton, la poitrine et les hanches vers le sol.",
                          "15",
                          A6));
			
			
			Activite A7 = activiteRepository.findById("A7").get();
			mouvementRepository.save(new Mouvement("Les pompes contres un mur",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "1- Debout sur la pointe des pieds, tendez vos bras devant vous, à hauteur de votre cou, et posez vos paumes contre le mur."
					+ "2- Fléchissez vos coudes vers l'extérieur et basculez votre poids du corps en avant, sans cambrer le dos et en contrôlant la descente."
					+ "3-boire de l'eau.",
					"5",
                    A7));
			
			mouvementRepository.save(new Mouvement("lévée de petites boutelleis",
					"Muscles les plus sollicités:les muscles des épaules"
					+ "Debout,jambes légèrement écartées, vous tenez une petite bouteille d'eau dans chaque main, "
					+ "remplie en fonction de ce que vous vous sentez capable de soulever, Vos bras sont le long de votre corps et vos coudes sont légèrement flèchis."
					+ "levez lentement vos bras sur les cotés jusqu'à ce qu'ils soient à l'horizontale,puis ramener-les au centre sans relacher.cette mouvement peut étre pratiqué par les femmes enceintes.",
					"10",
                    A7));
			
			mouvementRepository.save(new Mouvement("pompes genoux au sol",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "1- Agenouillez-vous sur le sol, pieds joints ou croisés et relevés, paumes de main à plat, un peu plus écretées que la largeur des épaules, bras tendus, index devant et pouces à l'intérieur. Contractez les abdominaux et les fesses et gardez cuisses, hanches, dos et tête alignés."
					+ "2-Fléchissez les coudes et venez effleurer le sol avec votre poitrine."
					+ "3-boire de l'eau.",
					"5",
                    A7));
			
			
			Activite A8 = activiteRepository.findById("A8").get();
			mouvementRepository.save(new Mouvement("Les pompes contres un mur",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "1- Debout sur la pointe des pieds, tendez vos bras devant vous, à hauteur de votre cou, et posez vos paumes contre le mur."
					+ "2- Fléchissez vos coudes vers l'extérieur et basculez votre poids du corps en avant, sans cambrer le dos et en contrôlant la descente."
					+ " 3-boire de l'eau.",
					"10",
					A8));
			
			mouvementRepository.save(new Mouvement("pompes genoux au sol",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ " 1- Agenouillez-vous sur le sol, pieds joints ou croisés et relevés, paumes de main à plat, un peu plus écretées que la largeur des épaules, bras tendus, index devant et pouces à l'intérieur. Contractez les abdominaux et les fesses et gardez cuisses, hanches, dos et tête alignés."
					+ "2-Fléchissez les coudes et venez effleurer le sol avec votre poitrine."
					+ "3-boire de l'eau.",
					"5",
					A8));
			
			mouvementRepository.save(new Mouvement("les pompes",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "Allongez-vous à plat ventre et placez vos mains à plat sur le sol, un peu plus écartées que la largeur des épaules.Prenez appui sur vos pointes de pieds -ou sur vos genoux, si vous débutez - etsur l'expiration, "
					+ "1-relevez votre corps en tendant les bras.Veillez à garder les épaules au-dessus de vos mains,à gainer vos abdominaux et à rester bien droit. "
					+ "2-sur l'inspiration,fléchessez les bras pour ramener le menton, la poitrine et les hanches vers le sol.",
					"5",
					A8));
		   
			
			
			Activite A9 = activiteRepository.findById("A9").get();
			mouvementRepository.save(new Mouvement("Les pompes contres un mur",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "1- Debout sur la pointe des pieds, tendez vos bras devant vous, à hauteur de votre cou, et posez vos paumes contre le mur."
					+ "2- Fléchissez vos coudes vers l'extérieur et basculez votre poids du corps en avant, sans cambrer le dos et en contrôlant la descente."
					+ "3-boire de l'eau.",
					"13",
					A9));
			
			mouvementRepository.save(new Mouvement("pompes genoux au sol",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "1- Agenouillez-vous sur le sol, pieds joints ou croisés et relevés, paumes de main à plat, un peu plus écretées que la largeur des épaules, bras tendus, index devant et pouces à l'intérieur. Contractez les abdominaux et les fesses et gardez cuisses, hanches, dos et tête alignés."
					+ "2-Fléchissez les coudes et venez effleurer le sol avec votre poitrine."
					+ "3-boire de l'eau.",
					"10",
					A9));
			
			mouvementRepository.save(new Mouvement("les pompes",
					"Muscles les plus sollicités: les triceps et les pectoraux"
					+ "Allongez-vous à plat ventre et placez vos mains à plat sur le sol, un peu plus écartées que la largeur des épaules.Prenez appui sur vos pointes de pieds -ou sur vos genoux, si vous débutez - etsur l'expiration, "
					+ "1-relevez votre corps en tendant les bras.Veillez à garder les épaules au-dessus de vos mains,à gainer vos abdominaux et à rester bien droit. "
					+ "2-sur l'inspiration,fléchessez les bras pour ramener le menton, la poitrine et les hanches vers le sol."
					+ "3-boire de l'eau.",
					"10",
					A9));
			
		};
		
	}

}
