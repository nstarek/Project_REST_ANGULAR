
export class Article {
    private id;
   private libelle:string;
    private marque:string;
    private id_categorie:string ;
    private prix:number;
    private ImagePath:string;
    private description:string;


constructor(id:number,libele:string,marque:string,id_categorie:string,prix:number,description:string,ImagePath:string){
      this.libelle=libele;
      this.description=description;
      this.marque=marque;
      this.id_categorie=id_categorie;
      this.ImagePath=ImagePath;
      this.prix=prix;
      this.id=id;
    }
}