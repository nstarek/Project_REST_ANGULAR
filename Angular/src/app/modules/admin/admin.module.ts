import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { CreateArticleComponent } from './create-article/create-article.component';
import { DeleteArticleComponent } from './delete-article/delete-article.component';
import { UpDateArticleComponent } from './up-date-article/up-date-article.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [CreateArticleComponent, DeleteArticleComponent, UpDateArticleComponent],
  imports: [
    CommonModule,
    AdminRoutingModule,
    FormsModule
  ]
})
export class AdminModule { }
