import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../../services/http.service';
import { AuthService } from '../../services/auth.service';


@Component({
  selector: 'app-createhospital',
  templateUrl: './createhospital.component.html',
  styleUrls: ['./createhospital.component.scss']
})
export class CreatehospitalComponent implements OnInit {
  itemForm!:FormGroup;
  equipmentForm!:FormGroup;
  formModel:any={status:null}
  

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
 
  //todo: Complete missing code..
  
}
