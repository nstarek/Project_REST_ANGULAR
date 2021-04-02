import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './modules/navbar/navbar.component';
import { PCPortableComponent } from './modules/ordinateur/pc_portable/pc-portable.component';
import { PCBureauComponent } from './modules/ordinateur/pc_bureau/pc-bureau.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TockageRoutingModule } from './modules/tockage/tockage-routing.module';
import { PhoneRoutingModule } from './modules/phone/phone-routing.module';
import { OrdinateurRoutingModule } from './modules/ordinateur/ordinateur-routing.module';

import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './modules/home/home.component';
import { ConnexionComponent } from './modules/connexion/connexion.component';
import { PCAccessoireComponent } from './modules/ordinateur/pc_accessoire/pc-accessoire.component';
import { AdminModule } from './modules/admin/admin.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { SmartphoneComponent } from './modules/phone/smartphone/smartphone.component';
import { TelephoneFixComponent } from './modules/phone/telephone-fix/telephone-fix.component';
import { AccessoirTelephoneComponent } from './modules/phone/accessoir-telephone/accessoir-telephone.component';
import { DisqueDureComponent } from './modules/tockage/disque-dure/disque-dure.component';
import { CleUSBComponent } from './modules/tockage/cle-usb/cle-usb.component';
import { AccessoirComponent } from './modules/tockage/accessoir/accessoir.component';







@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    PCPortableComponent,
    PCBureauComponent,
    PCAccessoireComponent,
    ConnexionComponent,
    SmartphoneComponent,
    TelephoneFixComponent,
    AccessoirTelephoneComponent,
    DisqueDureComponent,
    CleUSBComponent,
    AccessoirComponent,
  ],

  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    TockageRoutingModule,
    PhoneRoutingModule,
    OrdinateurRoutingModule,
    HttpClientModule,
    AdminModule,
    NgbModule,
    BrowserAnimationsModule,
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
