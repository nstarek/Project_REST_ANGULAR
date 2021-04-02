import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConnexionComponent } from './modules/connexion/connexion.component';
import { HomeComponent } from './modules/home/home.component';
import { AccessoirTelephoneComponent } from './modules/phone/accessoir-telephone/accessoir-telephone.component';
import { SmartphoneComponent } from './modules/phone/smartphone/smartphone.component';
import { TelephoneFixComponent } from './modules/phone/telephone-fix/telephone-fix.component';
import { PCAccessoireComponent } from './modules/ordinateur/pc_accessoire/pc-accessoire.component';
import { PCBureauComponent } from './modules/ordinateur/pc_bureau/pc-bureau.component';
import { PCPortableComponent } from './modules/ordinateur/pc_portable/pc-portable.component';
import { AuthontificationGuardGuard } from './guards/authontification-guard.guard';
import { CreateArticleComponent } from './modules/admin/create-article/create-article.component';
import { DeleteArticleComponent } from './modules/admin/delete-article/delete-article.component';
import { UpDateArticleComponent } from './modules/admin/up-date-article/up-date-article.component';





const routes: Routes = [
  {path:'Home',component: HomeComponent},
  {path:'PcPortable', component: PCPortableComponent},
  {path:'PcBureau', component: PCBureauComponent },
  {path:'Accessoires', component: PCAccessoireComponent },
  {path:'connexion', component: ConnexionComponent},
  {path:'Smartphones',component: SmartphoneComponent },
  {path:'TelFix',component: TelephoneFixComponent },
  {path:'PhoneAccessoires',component: AccessoirTelephoneComponent },

  
  {path:'stockage', loadChildren:'.\modules\tockage\tockage.module.ts'},

  {path:'Article',children:[
    {path:'addArticle',component: CreateArticleComponent , canActivate:[AuthontificationGuardGuard]},
    {path:'deletArticle',component:  DeleteArticleComponent , canActivate:[AuthontificationGuardGuard]},
    {path:'UpDateArticle',component: UpDateArticleComponent , canActivate:[AuthontificationGuardGuard]},
  ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
