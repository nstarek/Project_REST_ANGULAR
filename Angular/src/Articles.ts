/*enum Categorie {

	PCPortable, PCBureau,AccessoiresOrdinateurs,SmartPhone ,TelFixe ,
			AccessoiresTelephone, DisqueDur, CleUSB,AccessoiresStockage
}*/
export interface Articles {
    id: string;
    libelle:string;
    marque: string;
    prix : DoubleRange;
    description: string;
    ImagePath: string;
    id_categorie: string;
    
}
