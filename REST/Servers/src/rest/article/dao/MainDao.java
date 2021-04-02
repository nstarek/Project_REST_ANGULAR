package rest.article.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rest.article.model.Article;
import rest.article.model.Categorie;



public enum MainDao {
    instance;

    private Map<String, Categorie> contentProvider = new HashMap<>();
    private int last_article_id = 0;

    private MainDao() {
 
    	Categorie cat = new Categorie("1", "Ordinateurs",new ArrayList<Categorie>(),null);
    	Categorie sous_Categorie = new Categorie("2","PC Portable", null, new ArrayList<Article>());
    	
    	Article article = new Article(String.valueOf(last_article_id+1),"Ordinateur Portable 14 THOMSON N14CWH64","THOMSON", "2",200.0, "assets/images/pc1.jpg",
    			"Marque	THOMSON\r\n" + 
    			"Taille écran en pouces	14,1\"\r\n" + 
    			"Taille écran en cm	35,81 cm\r\n" + 
    			"Résolution de l'écran	1366 x 768 HD\r\n" + 
    			"Ecran tactile	Non\r\n" + 
    			"Processeur	INTEL Celeron N3350\r\n" + 
    			"Vitesse du processeur (GHz)	1,1 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	2,4 GHz\r\n" + 
    			"Nombre de cœurs	2\r\n" + 
    			"Mémoire vive (RAM)	4Go DDR3L\r\n" + 
    			"Carte graphique	Intel HD Graphics\r\n" + 
    			"Mémoire vidéo dédiée	Non\r\n" + 
    			"Capacité de stockage (Go)	64Go eMMC\r\n" + 
    			"Port Ethernet	Non\r\n" + 
    			"Port(s) USB 2.0	1\r\n" + 
    			"Port(s) USB 3.0	1");
    	
    	last_article_id++;
    	sous_Categorie.addArticle(article);

    
    	article = new Article(String.valueOf(last_article_id+1),"Ordinateur Portable ACER Nitro AN515-44-R9LV","ACER","2" ,900.00, "assets/images/pc2.jpg",
    			"\r\n" + 
    			"Marque	ACER\r\n" + 
    			"Taille écran en pouces	15,6\"\r\n" + 
    			"Taille écran en cm	39,624 cm\r\n" + 
    			"Résolution de l'écran	1920 x 1080 FHD\r\n" + 
    			"Ecran tactile	Non\r\n" + 
    			"Processeur	AMD Ryzen 5 4600H\r\n" + 
    			"Vitesse du processeur (GHz)	3 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	4 GHz\r\n" + 
    			"Nombre de cœurs	6\r\n" + 
    			"Mémoire vive (RAM)	8 Go DDR4\r\n" + 
    			"Carte graphique	NVIDIA GeForce GTX 1650\r\n" + 
    			"Mémoire vidéo dédiée	4Go\r\n" + 
    			"Capacité de stockage (Go)	512Go SSD");
    	last_article_id++;
    	sous_Categorie.addArticle(article);

    	
    	cat.addSousCategorie(sous_Categorie);
    	
    	
    	
  
    	Categorie sous_categorie_pcbureau = new Categorie("3","PC Bureau", null, new ArrayList<Article>());
    	
    	Article articles = new Article(String.valueOf(last_article_id+1),"Moniteur incurvé 27 SAMSUNG LC27F396FHUXEN","SAMSUNG", "3",400.0, "./assets/images/ordi1.jpg",
    			"Marque	SAMSUNG\r\n" + 
    			"Taille écran en pouces	27\"\r\n" + 
    			"Taille écran en cm	68,6 cm\r\n" + 
    			"Résolution de l'écran	1920 x 1080 FHD\r\n" + 
    			"Curved	Oui\r\n" + 
    			"Format de l'écran	16/9\r\n" + 
    			"Taux de contraste dynamique	Non communiqué\r\n" + 
    			"Taux de luminosité (Cd/m²)	250 (Cd/m²)\r\n" + 
    			"Temps de réponse (ms)	4ms\r\n" + 
    			"Angle de vision horizontal	178°\r\n" + 
    			"Angle de vision vertical	178°\r\n" + 
    			"Connectique	HDMI, VGA, Jack 3.5\r\n" + 
    			"Haut-parleur	Non\r\n" + 
    			"Fréquence de balayage (Hz)	60 Hz");
    	last_article_id++;
    	sous_categorie_pcbureau.addArticle(articles);

    	
    	articles = new Article(String.valueOf(last_article_id+1),"Moniteur PC ASUS 24  Ajustable VG248QG -165HZ-0.5ms","ASUS","3" ,224.00, "./assets/images/ordi2.jpg",
    			"Marque	ASUS\r\n" + 
    			"Taille écran en pouces	24\"\r\n" + 
    			"Taille écran en cm	60,96 cm\r\n" + 
    			"Résolution de l'écran	1920 x 1080 FHD\r\n" + 
    			"Curved	Non\r\n" + 
    			"Format de l'écran	16/9\r\n" + 
    			"Type de dalle	TN\r\n" + 
    			"Taux de contraste dynamique	100 000 000:1\r\n" + 
    			"Taux de luminosité (Cd/m²)	350 (Cd/m²)\r\n" + 
    			"Temps de réponse (ms)	0,5ms\r\n" + 
    			"Angle de vision horizontal	170°\r\n" + 
    			"Angle de vision vertical	160°\r\n" + 
    			"Connectique	DVI, HDMI, Jack 3.5, Display Port, VESA 100x100\r\n" + 
    			"Accessoires	1 Cable HDMI\r\n" + 
    			"Haut-parleur	2x 2 Watts");
    	last_article_id++;
    	sous_categorie_pcbureau.addArticle(articles);

    	
    	cat.addSousCategorie(sous_categorie_pcbureau);
    	
    	Categorie sous_categorie_PC_Accessoir = new Categorie("4","PC Accessoires", null, new ArrayList<Article>());
    	
    	Article articles_PC_Accessoi = new Article(String.valueOf(last_article_id+1),"Boîtier EDENWOOD 2.5\" HDD Enclosure-IDE+","EDENWOOD", "4",13.58, "./assets/images/ordiA2.jpg",
    			"\r\n" + 
    			"Marque	EDENWOOD\r\n" + 
    			"Type	Boîtier HDD\r\n" + 
    			"Informations complémentaires	Sécurisez et protégez vos disques durs grâce au boitier EDENWOOD by ElectroDépôt.\r\n" + 
    			"Son format accueillera tout disque dur format 2.5’’ IDE/SATA (7mm~9.5mm) SSD ou HDD de capacité max 1To.\r\n" + 
    			"Il dispose d’une interface USB 2.0 à haute vitesse de transfert, allant jusque 480mbps.\r\n" + 
    			"Compatible Windows XP/Vista/Win7/8/10,Mac OS.\r\n" + 
    			"Son look aluminium fin et élégant saura se faire une place sur votre bureau ! Idéal pour donner une seconde vie à au disque dur de votre PC ayant rendu l'âme et continuer à profiter de vos données !\r\n" + 
    			"Livré avec manuel d’utilisation, câble 50cm.\r\n" + 
    			"Poids net	0,22 kg\r\n" + 
    			"Poids brut	0,23 kg\r\n" + 
    			"Dimensions colis	H 0,18 cm x L 0,78 cm x P 1,375 cm\r\n" + 
    			"Code article	960715");
    	last_article_id++;
    	sous_categorie_PC_Accessoir.addArticle(articles_PC_Accessoi);

    	
    	articles_PC_Accessoi = new Article(String.valueOf(last_article_id+1),"Unité centrale HP reconditionné grade A+ 800 G3 Tower i5/8/500+24","HP","4" ,140.00, "./assets/images/ordiA1.jpg",
    			"Marque	HP RECOND.\r\n" + 
    			"Processeur	INTEL Core i5-6500\r\n" + 
    			"Vitesse du processeur (GHz)	3,2 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	3,6 GHz\r\n" + 
    			"Nombre de cœurs	4\r\n" + 
    			"Mémoire vive (RAM)	8 Go\r\n" + 
    			"Carte graphique	Intel HD Graphics 530\r\n" + 
    			"Mémoire vidéo dédiée	Non\r\n" + 
    			"Capacité de stockage (Go)	500Go (5400tr/min.)\r\n" + 
    			"Capacité du disque dur SSD (Go)	240Go\r\n" + 
    			"Wifi	Sans Wifi\r\n" + 
    			"Bluetooth	Sans bluetooth\r\n" + 
    			"Port(s) USB 2.0	4\r\n" + 
    			"Port(s) USB 3.0	6");
    	last_article_id++;
    	sous_categorie_PC_Accessoir.addArticle(articles_PC_Accessoi);

    	
    	cat.addSousCategorie(sous_categorie_PC_Accessoir);
    	contentProvider.put("1", cat);
    	
    	
    	
    	Categorie categorie_tel = new Categorie("5", "Telephones",new ArrayList<Categorie>(),null);
    	Categorie sous_Categorie_smartphone = new Categorie("6","Smartphone", null, new ArrayList<Article>());
    	
    	Article phone = new Article(String.valueOf(last_article_id+1),"SMARTPHONE SAMSUNG GALAXY A20e 32 Go Noir","SAMSUNG", "6",154.0, "./assets/images/phone1.jpg",
    			"\r\n" + 
    			"Marque	SAMSUNG\r\n" + 
    			"Modèle	GALAXY A20e\r\n" + 
    			"Système d'exploitation	Android 9 Pie\r\n" + 
    			"Surcouche	Oui\r\n" + 
    			"Résolution de l'écran	1560 x 720p HD+\r\n" + 
    			"Technologie de l'écran	IPS\r\n" + 
    			"Taille écran en pouces	5,8\"\r\n" + 
    			"Taille écran en cm	14,73 cm\r\n" + 
    			"Nom du processeur	Exynos 7884\r\n" + 
    			"Type de processeur	1,6 GHz Octa-Core\r\n" + 
    			"Mémoire vive (RAM)	3 Go\r\n" + 
    			"Mémoire interne (ROM)	32 Go\r\n" + 
    			"Extension de mémoire	extensible via port micro-SD (512 Go max)\r\n" + 
    			"Compatibilité opérateurs	Tout opérateur\r\n" + 
    			"Réseau	4G LTE");
    	last_article_id++;
    	sous_Categorie_smartphone.addArticle(phone);

    	phone = new Article(String.valueOf(last_article_id+1),"SMARTPHONE XIAOMI REDMI 9 64Go VERT + COQUE"," XIAOMI","6" ,200.00, "./assets/images/phone2.jpg",
    			"\r\n" + 
    			"Marque	XIAOMI\r\n" + 
    			"Modèle	REDMI 9\r\n" + 
    			"Système d'exploitation	Android 10\r\n" + 
    			"Surcouche	Oui\r\n" + 
    			"Résolution de l'écran	2340 x 1080p FHD+\r\n" + 
    			"Technologie de l'écran	IPS & Corning Gorilla Glass 3\r\n" + 
    			"Taille écran en pouces	6,53\"\r\n" + 
    			"Taille écran en cm	16,58 cm\r\n" + 
    			"Nom du processeur	Helio G80\r\n" + 
    			"Type de processeur	2.0 GHz Octa-core\r\n" + 
    			"Mémoire vive (RAM)	4 Go\r\n" + 
    			"Mémoire interne (ROM)	64 Go\r\n" + 
    			"Extension de mémoire	extensible via port micro-SD (512 Go max)\r\n" + 
    			"Compatibilité opérateurs	Tout opérateur\r\n" + 
    			"Réseau	4G LTE\r\n" + 
    			"Type de carte Sim	Dual SIM (2x nano)");
    	last_article_id++;
    	sous_Categorie_smartphone.addArticle(phone);

    	categorie_tel.addSousCategorie(sous_Categorie_smartphone);
    	
    	
    	
    	
    	Categorie sous_Categorie_tel_fix = new Categorie("7","Telephone fixe", null, new ArrayList<Article>());
    	
    	Article fix= new Article(String.valueOf(last_article_id+1),"Téléphone solo répondeur EDENWOOD TSR 1 Noir","EDENWOOD", "7",20.0, "./assets/images/fixe1.jpg",
    			"Marque	EDENWOOD\r\n" + 
    			"Répertoire	20\r\n" + 
    			"Compatible Box	Oui\r\n" + 
    			"Mains-libres	Oui\r\n" + 
    			"Autonomie	jusqu'à 7 heures\r\n" + 
    			"Fonction répondeur	Oui\r\n" + 
    			"Nombre de combinés	1\r\n" + 
    			"Nombre de mélodies	10\r\n" + 
    			"Coloris	Noir\r\n" + 
    			"Informations complémentaires	Découvrir notre Marque et nos Produits Edenwood\r\n" + 
    			"Dimensions colis	H 14 cm x L 6,5 cm x P 17 cm\r\n" + 
    			"Poids brut	0,45 kg\r\n" + 
    			"Code article	966757");
    	last_article_id++;
    	sous_Categorie_tel_fix.addArticle(fix);

    	phone = new Article(String.valueOf(last_article_id+1),"Téléphone duo avec répondeur VEGA255T DUO BLANC","Téléphone duo avec répondeur VEGA255T DUO BLANC","7" ,39.00, "./assets/images/fixe2.jpg",
    			"Marque	LOGICOM\r\n" + 
    			"Répertoire	20\r\n" + 
    			"Compatible Box	Oui\r\n" + 
    			"Mains-libres	Oui\r\n" + 
    			"Autonomie	7 heures\r\n" + 
    			"Fonction répondeur	Oui\r\n" + 
    			"Nombre de combinés	2\r\n" + 
    			"Nombre de mélodies	10\r\n" + 
    			"Coloris	Noir\r\n" + 
    			"Informations complémentaires	Recomposition des 5 derniers numéros\r\n" + 
    			"Verrouillage du clavier Accès protégé par code PIN (4 chiffres)\r\n" + 
    			"Alarme\r\n" + 
    			"Compatible technologie GAP\r\n" + 
    			"Dimensions colis	H 17,4 cm x L 16,5 cm x P 7 cm\r\n" + 
    			"Poids brut	0,63 kg\r\n" + 
    			"Code article	966687");
    	last_article_id++;
    	sous_Categorie_tel_fix.addArticle(phone);
    	
    	categorie_tel.addSousCategorie(sous_Categorie_tel_fix);
    	
    	
    	
    	Categorie sous_Categorie_tel_acc = new Categorie("8","Accessoire Tel", null, new ArrayList<Article>());
    	
    	Article acc= new Article(String.valueOf(last_article_id+1),"Ecouteurs Apple AirPods 2 + boitier de charge ", "Apple","8",148.0, "./assets/images/appelE.jpg",
    			"• Autonomie : 24 heures\r\n" + 
    			"\r\n" + 
    			"• Répondez aux appels grâce au micro intégré\r\n" + 
    			"\r\n" + 
    			"• Le son se déclenche automatiquement dès qu'on les place à l'oreille et se met en veille dès qu'on les retire\r\n" + 
    			"\r\n" + 
    			"• Recharge rapide : 15min suffisent pour 3h d'écoute\r\n" + 
    			"\r\n" + 
    			"• Assistant vocal Siri intégré\r\n" + 
    			"\r\n" + 
    			"Pratiques et fiables, les écouteurs Airpods 2 vous accompagneront partout grâce à leur boîtier qui permet plusieurs recharges !");
    	last_article_id++;
    	sous_Categorie_tel_acc.addArticle(acc);

    	acc = new Article(String.valueOf(last_article_id+1),"CÂBLE CHARGE lightning HIGH ONE 1m blanc","HIGH ONE","8" ,1.97, "./assets/images/cable.jpg",
    			"Marque	HIGH ONE\r\n" + 
    			"Type de produit	Câble charge Lightning®\r\n" + 
    			"Coloris	Blanc\r\n" + 
    			"Dimensions produit	H 9,5 cm x L 2,5 cm x P 7,3 cm\r\n" + 
    			"Poids net	0,14 kg\r\n" + 
    			"Code article	966363");
    	last_article_id++;
    	sous_Categorie_tel_acc.addArticle(acc);
    	
    	categorie_tel.addSousCategorie(sous_Categorie_tel_acc );
    	contentProvider.put("2",categorie_tel);
    	
    
    	Categorie Stockage = new Categorie("9", "Stockage",new ArrayList<Categorie>(),null);
    	Categorie sous_Categorie_disqueDure = new Categorie("10","Disque Dur", null, new ArrayList<Article>());
    	
    	Article disque = new Article(String.valueOf(last_article_id+1),"Samsung SSD Portable T5 1 To Noir","Samsung", "10",139.0, "./assets/images/disk1.jpg",
    			"Capacité : 1 To\r\n" + 
    			"Ultra-compact\r\n" + 
    			"Jusqu'à 540 Mo/s\r\n" + 
    			"Connectique USB Type-C");
    	last_article_id++;
    	sous_Categorie_disqueDure .addArticle(disque);

    	
    	disque = new Article(String.valueOf(last_article_id+1),"Disque dur externe 2.5\" SEAGATE BASICS","SEAGATE BASICS","10" ,39.98, "./assets/images/disk2.jpg",
    			"\r\n" + 
    			"Marque	SEAGATE\r\n" + 
    			"Format	2.5\"\r\n" + 
    			"Type	Disque dur mécanique\r\n" + 
    			"Capacité (Go)	1 000 Go\r\n" + 
    			"Connectique	USB 3.0\r\n" + 
    			"Alimentation	USB\r\n" + 
    			"Wifi	Non\r\n" + 
    			"Compatibilité logicielle	WINDOWS, Mac OS, PS4\r\n" + 
    			"Matière du boitier	Plastique\r\n" + 
    			"Coloris	Noir");
    	last_article_id++;
    	sous_Categorie_disqueDure .addArticle(disque);

    	
    	Stockage.addSousCategorie(sous_Categorie_disqueDure );
   
    	Categorie sous_Categorie_USB = new Categorie("11","Cle USB", null, new ArrayList<Article>());
    	
    	Article USB = new Article(String.valueOf(last_article_id+1),"Clé USB 8go MEDIARANGE","MEDIA-RANGE ", "11",3.98, "./assets/images/usb2.jpg",
    			"Marque	MEDIA-RANGE\r\n" + 
    			"Type de clé	Clé USB 2.0\r\n" + 
    			"Capacité de stockage (Go)	8 Go\r\n" + 
    			"Vitesse de lecture (Mb/s)	17\r\n" + 
    			"Vitesse d'écriture (Mb/s)	4\r\n" + 
    			"Dimensions produit	H 1,1 cm x L 1,1 cm x P 5,6 cm\r\n" + 
    			"Dimensions colis	H 1 cm x L 9 cm x P 13,5 cm\r\n" + 
    			"Poids brut	0,05 kg\r\n" + 
    			"Code article	954579");
    	last_article_id++;
    	 sous_Categorie_USB.addArticle( USB);

    	
    	 USB = new Article(String.valueOf(last_article_id+1),"Clé USB MAXELL 64Go USB c + USB3.0","MAXELL ","11" ,14.97, "./assets/images/usb1.jpg",
    			 "Marque	MAXELL\r\n" + 
    			 "Type de clé	Clé 2 ports USB / USB-C\r\n" + 
    			 "Capacité de stockage (Go)	64 Go\r\n" + 
    			 "Informations complémentaires	Permet de partager facilement des Photos, des Documents, de la\r\n" + 
    			 "Musique avec votre ordinateur , votre tablette ou même votre\r\n" + 
    			 "Téléphone portable avec port USB-C\r\n" + 
    			 "\r\n" + 
    			 "La Clé USB Max’l Dual est rotative à 360\r\n" + 
    			 "avec une protection métallique ,\r\n" + 
    			 "Dimensions colis	H 11,5 cm x L 10,3 cm x P 2 cm\r\n" + 
    			 "Poids brut	0,08 kg\r\n" + 
    			 "Code article	967574");
    	last_article_id++;
    	 sous_Categorie_USB .addArticle( USB);

    	Stockage.addSousCategorie( sous_Categorie_USB );
    	
    	Categorie sous_Categorie_stockage_acc = new Categorie("12","Accessoire Stockage", null, new ArrayList<Article>());
    	
    	Article acce = new Article(String.valueOf(last_article_id+1),"Disque dur interne 2,5 \" TOSHIBA 1 To L200 SATA","TOSHIBA", "12",47.97, "./assets/images/diskI.jpg",
    			"Marque	TOSHIBA\r\n" + 
    			"Format	2.5\"\r\n" + 
    			"Type	Disque dur mécanique\r\n" + 
    			"Capacité (Go)	1 000 Go\r\n" + 
    			"Connectique	Sata\r\n" + 
    			"Alimentation	Sata 3\r\n" + 
    			"Informations complémentaires	Le disque dur interne de 2,5 pouces L200 de Toshiba est destiné aux joueurs et aux utilisateurs quotidiens d’ordinateurs portables. Il est idéal pour accroître la capacité de stockage de votre PC portable ou de votre console de\r\n" + 
    			"jeux de 1 To. Les technologies Perpendicular Magnetic\r\n" + 
    			"Recording et Tunnel Magneto-Resistive Recording assurent\r\n" + 
    			"également un enregistrement rapide et stable afin de tirer le\r\n" + 
    			"meilleur parti de votre espace disque. Le L200 intègre la durabilité et\r\n" + 
    			"la fiabilité réputées de la technologie Toshiba dans votre PC\r\n" + 
    			"portable ou votre console de jeux.\r\n" + 
    			"Utilisations :\r\n" + 
    			"• PC portables\r\n" + 
    			"• Consoles de jeux\r\n" + 
    			"• Boîtiers externes\r\n" + 
    			"Dimensions produit	H 0,95 cm x L 10 cm x P 6,98 cm\r\n" + 
    			"Dimensions colis	H 4 cm x L 14,5 cm x P 11 cm\r\n" + 
    			"Poids net	0,117 kg\r\n" + 
    			"Poids brut	0,117 kg\r\n" + 
    			"Code article	959801\r\n" + 
    			"Disponibilité pièces détachées (données fournisseur)	6 ans date d'achat");
    	last_article_id++;
    	sous_Categorie_stockage_acc.addArticle( acce );

    	
    	 acce  = new Article(String.valueOf(last_article_id+1),"Carte Micro SD EMTEC 32 Go class 10","EMTEC","12" ,6.97, "./assets/images/emetc.jpg",
    			 "\r\n" + 
    			 "Marque	EMTEC\r\n" + 
    			 "Type	Carte Micro SD\r\n" + 
    			 "Capacité (Go)	32 Go\r\n" + 
    			 "Vitesse de lecture (Mb/s)	20\r\n" + 
    			 "Vitesse d'écriture (Mb/s)	12\r\n" + 
    			 "Catégorie	Classe 10\r\n" + 
    			 "Dimensions produit	H 0,75 cm x L 13,5 cm x P 9,6 cm\r\n" + 
    			 "Dimensions colis	H 0,75 cm x L 13,5 cm x P 9,6 cm\r\n" + 
    			 "Poids brut	0,013 kg\r\n" + 
    			 "Code article	958575");
    	last_article_id++;
    	sous_Categorie_stockage_acc .addArticle(  acce );

    	Stockage.addSousCategorie( sous_Categorie_stockage_acc );
    	contentProvider.put("3", Stockage);
    }
    
    public Map<String, Categorie> getModel(){
        return contentProvider;
    }
    
    public Article getArticleFromDao(String id) {
    	for(Categorie x:this.contentProvider.values()) {
			for (Categorie y:x.getSousCategorie()) {
				for(Article a : y.getArticles()) {
					if(a.getId().equals(id)) {
						return a;
					}
				}
			}
		}
        return null; 
    }
    
    public List<Article> getArticlesFromDao() {
    	 List<Article> articles = new ArrayList<Article>();
         for(Categorie x:this.contentProvider.values()) {
     			for (Categorie y:x.getSousCategorie()) {
     				articles.addAll(y.getArticles());
     			}
     		}
         return articles;
    }
    
    public Categorie findCategorieByName(String name) {
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if(x.getNom().equals(name)) {
    			return x;
    		}
    		for (Categorie y:x.getSousCategorie()) {
    				if(y.getNom().equals(name)) {
    					return y;
    				}
    			}
    	}
    	return null;
    }
    
    public Categorie findCatById(String id){
    	for(Categorie x:MainDao.instance.getModel().values()) {
    		if(x.getId().equals(id)) {
    			return x;
    		}
    		for (Categorie y:x.getSousCategorie()) {
    				if(y.getId().equals(id)) {
    					return y;
    				}
    			}
    	}
    	return null;
    }
    
  
    
    public boolean addArticle(Article a) {
    	Categorie c = findCatById(a.getCategorie());
    	if(c.addArticle(a)) {
    		last_article_id++;
    		return true;
    	}
    	return false;
    }
    
    public int getLast_id() {
    	return this.last_article_id;
    }
    
    
    

}
