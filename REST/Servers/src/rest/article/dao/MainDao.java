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
    			"Taille �cran en pouces	14,1\"\r\n" + 
    			"Taille �cran en cm	35,81 cm\r\n" + 
    			"R�solution de l'�cran	1366 x 768 HD\r\n" + 
    			"Ecran tactile	Non\r\n" + 
    			"Processeur	INTEL Celeron N3350\r\n" + 
    			"Vitesse du processeur (GHz)	1,1 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	2,4 GHz\r\n" + 
    			"Nombre de c�urs	2\r\n" + 
    			"M�moire vive (RAM)	4Go DDR3L\r\n" + 
    			"Carte graphique	Intel HD Graphics\r\n" + 
    			"M�moire vid�o d�di�e	Non\r\n" + 
    			"Capacit� de stockage (Go)	64Go eMMC\r\n" + 
    			"Port Ethernet	Non\r\n" + 
    			"Port(s) USB 2.0	1\r\n" + 
    			"Port(s) USB 3.0	1");
    	
    	last_article_id++;
    	sous_Categorie.addArticle(article);

    
    	article = new Article(String.valueOf(last_article_id+1),"Ordinateur Portable ACER Nitro AN515-44-R9LV","ACER","2" ,900.00, "assets/images/pc2.jpg",
    			"\r\n" + 
    			"Marque	ACER\r\n" + 
    			"Taille �cran en pouces	15,6\"\r\n" + 
    			"Taille �cran en cm	39,624 cm\r\n" + 
    			"R�solution de l'�cran	1920 x 1080 FHD\r\n" + 
    			"Ecran tactile	Non\r\n" + 
    			"Processeur	AMD Ryzen 5 4600H\r\n" + 
    			"Vitesse du processeur (GHz)	3 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	4 GHz\r\n" + 
    			"Nombre de c�urs	6\r\n" + 
    			"M�moire vive (RAM)	8 Go DDR4\r\n" + 
    			"Carte graphique	NVIDIA GeForce GTX 1650\r\n" + 
    			"M�moire vid�o d�di�e	4Go\r\n" + 
    			"Capacit� de stockage (Go)	512Go SSD");
    	last_article_id++;
    	sous_Categorie.addArticle(article);

    	
    	cat.addSousCategorie(sous_Categorie);
    	
    	
    	
  
    	Categorie sous_categorie_pcbureau = new Categorie("3","PC Bureau", null, new ArrayList<Article>());
    	
    	Article articles = new Article(String.valueOf(last_article_id+1),"Moniteur incurv� 27 SAMSUNG LC27F396FHUXEN","SAMSUNG", "3",400.0, "./assets/images/ordi1.jpg",
    			"Marque	SAMSUNG\r\n" + 
    			"Taille �cran en pouces	27\"\r\n" + 
    			"Taille �cran en cm	68,6 cm\r\n" + 
    			"R�solution de l'�cran	1920 x 1080 FHD\r\n" + 
    			"Curved	Oui\r\n" + 
    			"Format de l'�cran	16/9\r\n" + 
    			"Taux de contraste dynamique	Non communiqu�\r\n" + 
    			"Taux de luminosit� (Cd/m�)	250 (Cd/m�)\r\n" + 
    			"Temps de r�ponse (ms)	4ms\r\n" + 
    			"Angle de vision horizontal	178�\r\n" + 
    			"Angle de vision vertical	178�\r\n" + 
    			"Connectique	HDMI, VGA, Jack 3.5\r\n" + 
    			"Haut-parleur	Non\r\n" + 
    			"Fr�quence de balayage (Hz)	60 Hz");
    	last_article_id++;
    	sous_categorie_pcbureau.addArticle(articles);

    	
    	articles = new Article(String.valueOf(last_article_id+1),"Moniteur PC ASUS 24  Ajustable VG248QG -165HZ-0.5ms","ASUS","3" ,224.00, "./assets/images/ordi2.jpg",
    			"Marque	ASUS\r\n" + 
    			"Taille �cran en pouces	24\"\r\n" + 
    			"Taille �cran en cm	60,96 cm\r\n" + 
    			"R�solution de l'�cran	1920 x 1080 FHD\r\n" + 
    			"Curved	Non\r\n" + 
    			"Format de l'�cran	16/9\r\n" + 
    			"Type de dalle	TN\r\n" + 
    			"Taux de contraste dynamique	100 000 000:1\r\n" + 
    			"Taux de luminosit� (Cd/m�)	350 (Cd/m�)\r\n" + 
    			"Temps de r�ponse (ms)	0,5ms\r\n" + 
    			"Angle de vision horizontal	170�\r\n" + 
    			"Angle de vision vertical	160�\r\n" + 
    			"Connectique	DVI, HDMI, Jack 3.5, Display Port, VESA 100x100\r\n" + 
    			"Accessoires	1 Cable HDMI\r\n" + 
    			"Haut-parleur	2x 2 Watts");
    	last_article_id++;
    	sous_categorie_pcbureau.addArticle(articles);

    	
    	cat.addSousCategorie(sous_categorie_pcbureau);
    	
    	Categorie sous_categorie_PC_Accessoir = new Categorie("4","PC Accessoires", null, new ArrayList<Article>());
    	
    	Article articles_PC_Accessoi = new Article(String.valueOf(last_article_id+1),"Bo�tier EDENWOOD 2.5\" HDD Enclosure-IDE+","EDENWOOD", "4",13.58, "./assets/images/ordiA2.jpg",
    			"\r\n" + 
    			"Marque	EDENWOOD\r\n" + 
    			"Type	Bo�tier HDD\r\n" + 
    			"Informations compl�mentaires	S�curisez et prot�gez vos disques durs gr�ce au boitier EDENWOOD by ElectroD�p�t.\r\n" + 
    			"Son format accueillera tout disque dur format 2.5�� IDE/SATA (7mm~9.5mm) SSD ou HDD de capacit� max 1To.\r\n" + 
    			"Il dispose d�une interface USB 2.0 � haute vitesse de transfert, allant jusque 480mbps.\r\n" + 
    			"Compatible Windows XP/Vista/Win7/8/10,Mac OS.\r\n" + 
    			"Son look aluminium fin et �l�gant saura se faire une place sur votre bureau ! Id�al pour donner une seconde vie � au disque dur de votre PC ayant rendu l'�me et continuer � profiter de vos donn�es !\r\n" + 
    			"Livr� avec manuel d�utilisation, c�ble 50cm.\r\n" + 
    			"Poids net	0,22 kg\r\n" + 
    			"Poids brut	0,23 kg\r\n" + 
    			"Dimensions colis	H 0,18 cm x L 0,78 cm x P 1,375 cm\r\n" + 
    			"Code article	960715");
    	last_article_id++;
    	sous_categorie_PC_Accessoir.addArticle(articles_PC_Accessoi);

    	
    	articles_PC_Accessoi = new Article(String.valueOf(last_article_id+1),"Unit� centrale HP reconditionn� grade A+ 800 G3 Tower i5/8/500+24","HP","4" ,140.00, "./assets/images/ordiA1.jpg",
    			"Marque	HP RECOND.\r\n" + 
    			"Processeur	INTEL Core i5-6500\r\n" + 
    			"Vitesse du processeur (GHz)	3,2 GHz\r\n" + 
    			"Vitesse du processeur en mode turbo (Ghz)	3,6 GHz\r\n" + 
    			"Nombre de c�urs	4\r\n" + 
    			"M�moire vive (RAM)	8 Go\r\n" + 
    			"Carte graphique	Intel HD Graphics 530\r\n" + 
    			"M�moire vid�o d�di�e	Non\r\n" + 
    			"Capacit� de stockage (Go)	500Go (5400tr/min.)\r\n" + 
    			"Capacit� du disque dur SSD (Go)	240Go\r\n" + 
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
    			"Mod�le	GALAXY A20e\r\n" + 
    			"Syst�me d'exploitation	Android 9 Pie\r\n" + 
    			"Surcouche	Oui\r\n" + 
    			"R�solution de l'�cran	1560 x 720p HD+\r\n" + 
    			"Technologie de l'�cran	IPS\r\n" + 
    			"Taille �cran en pouces	5,8\"\r\n" + 
    			"Taille �cran en cm	14,73 cm\r\n" + 
    			"Nom du processeur	Exynos 7884\r\n" + 
    			"Type de processeur	1,6 GHz Octa-Core\r\n" + 
    			"M�moire vive (RAM)	3 Go\r\n" + 
    			"M�moire interne (ROM)	32 Go\r\n" + 
    			"Extension de m�moire	extensible via port micro-SD (512 Go max)\r\n" + 
    			"Compatibilit� op�rateurs	Tout op�rateur\r\n" + 
    			"R�seau	4G LTE");
    	last_article_id++;
    	sous_Categorie_smartphone.addArticle(phone);

    	phone = new Article(String.valueOf(last_article_id+1),"SMARTPHONE XIAOMI REDMI 9 64Go VERT + COQUE"," XIAOMI","6" ,200.00, "./assets/images/phone2.jpg",
    			"\r\n" + 
    			"Marque	XIAOMI\r\n" + 
    			"Mod�le	REDMI 9\r\n" + 
    			"Syst�me d'exploitation	Android 10\r\n" + 
    			"Surcouche	Oui\r\n" + 
    			"R�solution de l'�cran	2340 x 1080p FHD+\r\n" + 
    			"Technologie de l'�cran	IPS & Corning Gorilla Glass 3\r\n" + 
    			"Taille �cran en pouces	6,53\"\r\n" + 
    			"Taille �cran en cm	16,58 cm\r\n" + 
    			"Nom du processeur	Helio G80\r\n" + 
    			"Type de processeur	2.0 GHz Octa-core\r\n" + 
    			"M�moire vive (RAM)	4 Go\r\n" + 
    			"M�moire interne (ROM)	64 Go\r\n" + 
    			"Extension de m�moire	extensible via port micro-SD (512 Go max)\r\n" + 
    			"Compatibilit� op�rateurs	Tout op�rateur\r\n" + 
    			"R�seau	4G LTE\r\n" + 
    			"Type de carte Sim	Dual SIM (2x nano)");
    	last_article_id++;
    	sous_Categorie_smartphone.addArticle(phone);

    	categorie_tel.addSousCategorie(sous_Categorie_smartphone);
    	
    	
    	
    	
    	Categorie sous_Categorie_tel_fix = new Categorie("7","Telephone fixe", null, new ArrayList<Article>());
    	
    	Article fix= new Article(String.valueOf(last_article_id+1),"T�l�phone solo r�pondeur EDENWOOD TSR 1 Noir","EDENWOOD", "7",20.0, "./assets/images/fixe1.jpg",
    			"Marque	EDENWOOD\r\n" + 
    			"R�pertoire	20\r\n" + 
    			"Compatible Box	Oui\r\n" + 
    			"Mains-libres	Oui\r\n" + 
    			"Autonomie	jusqu'� 7 heures\r\n" + 
    			"Fonction r�pondeur	Oui\r\n" + 
    			"Nombre de combin�s	1\r\n" + 
    			"Nombre de m�lodies	10\r\n" + 
    			"Coloris	Noir\r\n" + 
    			"Informations compl�mentaires	D�couvrir notre Marque et nos Produits Edenwood\r\n" + 
    			"Dimensions colis	H 14 cm x L 6,5 cm x P 17 cm\r\n" + 
    			"Poids brut	0,45 kg\r\n" + 
    			"Code article	966757");
    	last_article_id++;
    	sous_Categorie_tel_fix.addArticle(fix);

    	phone = new Article(String.valueOf(last_article_id+1),"T�l�phone duo avec r�pondeur VEGA255T DUO BLANC","T�l�phone duo avec r�pondeur VEGA255T DUO BLANC","7" ,39.00, "./assets/images/fixe2.jpg",
    			"Marque	LOGICOM\r\n" + 
    			"R�pertoire	20\r\n" + 
    			"Compatible Box	Oui\r\n" + 
    			"Mains-libres	Oui\r\n" + 
    			"Autonomie	7 heures\r\n" + 
    			"Fonction r�pondeur	Oui\r\n" + 
    			"Nombre de combin�s	2\r\n" + 
    			"Nombre de m�lodies	10\r\n" + 
    			"Coloris	Noir\r\n" + 
    			"Informations compl�mentaires	Recomposition des 5 derniers num�ros\r\n" + 
    			"Verrouillage du clavier Acc�s prot�g� par code PIN (4 chiffres)\r\n" + 
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
    			"� Autonomie : 24 heures\r\n" + 
    			"\r\n" + 
    			"� R�pondez aux appels gr�ce au micro int�gr�\r\n" + 
    			"\r\n" + 
    			"� Le son se d�clenche automatiquement d�s qu'on les place � l'oreille et se met en veille d�s qu'on les retire\r\n" + 
    			"\r\n" + 
    			"� Recharge rapide : 15min suffisent pour 3h d'�coute\r\n" + 
    			"\r\n" + 
    			"� Assistant vocal Siri int�gr�\r\n" + 
    			"\r\n" + 
    			"Pratiques et fiables, les �couteurs Airpods 2 vous accompagneront partout gr�ce � leur bo�tier qui permet plusieurs recharges !");
    	last_article_id++;
    	sous_Categorie_tel_acc.addArticle(acc);

    	acc = new Article(String.valueOf(last_article_id+1),"C�BLE CHARGE lightning HIGH ONE 1m blanc","HIGH ONE","8" ,1.97, "./assets/images/cable.jpg",
    			"Marque	HIGH ONE\r\n" + 
    			"Type de produit	C�ble charge Lightning�\r\n" + 
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
    			"Capacit� : 1 To\r\n" + 
    			"Ultra-compact\r\n" + 
    			"Jusqu'� 540 Mo/s\r\n" + 
    			"Connectique USB Type-C");
    	last_article_id++;
    	sous_Categorie_disqueDure .addArticle(disque);

    	
    	disque = new Article(String.valueOf(last_article_id+1),"Disque dur externe 2.5\" SEAGATE BASICS","SEAGATE BASICS","10" ,39.98, "./assets/images/disk2.jpg",
    			"\r\n" + 
    			"Marque	SEAGATE\r\n" + 
    			"Format	2.5\"\r\n" + 
    			"Type	Disque dur m�canique\r\n" + 
    			"Capacit� (Go)	1 000 Go\r\n" + 
    			"Connectique	USB 3.0\r\n" + 
    			"Alimentation	USB\r\n" + 
    			"Wifi	Non\r\n" + 
    			"Compatibilit� logicielle	WINDOWS, Mac OS, PS4\r\n" + 
    			"Mati�re du boitier	Plastique\r\n" + 
    			"Coloris	Noir");
    	last_article_id++;
    	sous_Categorie_disqueDure .addArticle(disque);

    	
    	Stockage.addSousCategorie(sous_Categorie_disqueDure );
   
    	Categorie sous_Categorie_USB = new Categorie("11","Cle USB", null, new ArrayList<Article>());
    	
    	Article USB = new Article(String.valueOf(last_article_id+1),"Cl� USB 8go MEDIARANGE","MEDIA-RANGE ", "11",3.98, "./assets/images/usb2.jpg",
    			"Marque	MEDIA-RANGE\r\n" + 
    			"Type de cl�	Cl� USB 2.0\r\n" + 
    			"Capacit� de stockage (Go)	8 Go\r\n" + 
    			"Vitesse de lecture (Mb/s)	17\r\n" + 
    			"Vitesse d'�criture (Mb/s)	4\r\n" + 
    			"Dimensions produit	H 1,1 cm x L 1,1 cm x P 5,6 cm\r\n" + 
    			"Dimensions colis	H 1 cm x L 9 cm x P 13,5 cm\r\n" + 
    			"Poids brut	0,05 kg\r\n" + 
    			"Code article	954579");
    	last_article_id++;
    	 sous_Categorie_USB.addArticle( USB);

    	
    	 USB = new Article(String.valueOf(last_article_id+1),"Cl� USB MAXELL 64Go USB c + USB3.0","MAXELL ","11" ,14.97, "./assets/images/usb1.jpg",
    			 "Marque	MAXELL\r\n" + 
    			 "Type de cl�	Cl� 2 ports USB / USB-C\r\n" + 
    			 "Capacit� de stockage (Go)	64 Go\r\n" + 
    			 "Informations compl�mentaires	Permet de partager facilement des Photos, des Documents, de la\r\n" + 
    			 "Musique avec votre ordinateur , votre tablette ou m�me votre\r\n" + 
    			 "T�l�phone portable avec port USB-C\r\n" + 
    			 "\r\n" + 
    			 "La Cl� USB Max�l Dual est rotative � 360\r\n" + 
    			 "avec une protection m�tallique ,\r\n" + 
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
    			"Type	Disque dur m�canique\r\n" + 
    			"Capacit� (Go)	1 000 Go\r\n" + 
    			"Connectique	Sata\r\n" + 
    			"Alimentation	Sata 3\r\n" + 
    			"Informations compl�mentaires	Le disque dur interne de 2,5 pouces L200 de Toshiba est destin� aux joueurs et aux utilisateurs quotidiens d�ordinateurs portables. Il est id�al pour accro�tre la capacit� de stockage de votre PC portable ou de votre console de\r\n" + 
    			"jeux de 1 To. Les technologies Perpendicular Magnetic\r\n" + 
    			"Recording et Tunnel Magneto-Resistive Recording assurent\r\n" + 
    			"�galement un enregistrement rapide et stable afin de tirer le\r\n" + 
    			"meilleur parti de votre espace disque. Le L200 int�gre la durabilit� et\r\n" + 
    			"la fiabilit� r�put�es de la technologie Toshiba dans votre PC\r\n" + 
    			"portable ou votre console de jeux.\r\n" + 
    			"Utilisations :\r\n" + 
    			"� PC portables\r\n" + 
    			"� Consoles de jeux\r\n" + 
    			"� Bo�tiers externes\r\n" + 
    			"Dimensions produit	H 0,95 cm x L 10 cm x P 6,98 cm\r\n" + 
    			"Dimensions colis	H 4 cm x L 14,5 cm x P 11 cm\r\n" + 
    			"Poids net	0,117 kg\r\n" + 
    			"Poids brut	0,117 kg\r\n" + 
    			"Code article	959801\r\n" + 
    			"Disponibilit� pi�ces d�tach�es (donn�es fournisseur)	6 ans date d'achat");
    	last_article_id++;
    	sous_Categorie_stockage_acc.addArticle( acce );

    	
    	 acce  = new Article(String.valueOf(last_article_id+1),"Carte Micro SD EMTEC 32 Go class 10","EMTEC","12" ,6.97, "./assets/images/emetc.jpg",
    			 "\r\n" + 
    			 "Marque	EMTEC\r\n" + 
    			 "Type	Carte Micro SD\r\n" + 
    			 "Capacit� (Go)	32 Go\r\n" + 
    			 "Vitesse de lecture (Mb/s)	20\r\n" + 
    			 "Vitesse d'�criture (Mb/s)	12\r\n" + 
    			 "Cat�gorie	Classe 10\r\n" + 
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
