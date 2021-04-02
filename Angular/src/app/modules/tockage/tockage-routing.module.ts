import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AccessoirComponent } from './accessoir/accessoir.component';
import { CleUSBComponent } from './cle-usb/cle-usb.component';
import { DisqueDureComponent } from './disque-dure/disque-dure.component';

const routes: Routes = [
  {path:'DisqueDur',component: DisqueDureComponent},
  {path:'USB',component: CleUSBComponent},
  {path:'AccessoiresStockage',component: AccessoirComponent },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TockageRoutingModule { }
