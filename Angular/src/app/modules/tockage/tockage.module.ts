import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TockageRoutingModule } from './tockage-routing.module';
import { DisqueDureComponent } from './disque-dure/disque-dure.component';
import { CleUSBComponent } from './cle-usb/cle-usb.component';
import { AccessoirComponent } from './accessoir/accessoir.component';


@NgModule({
  declarations: [DisqueDureComponent , CleUSBComponent, AccessoirComponent],
  imports: [
    CommonModule,
    TockageRoutingModule
  ]
})
export class TockageModule { }
