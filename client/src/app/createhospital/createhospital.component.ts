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
export class CreatehospitalComponent implements OnInit 
{
  itemForm!:FormGroup;
  equipmentForm!:FormGroup;
  formModel:any={status:null};
  showError:boolean=false;
  errorMessage:any;
  hospitalList:any=[];
  assignModel:any={};
  showMessage:any;
  responseMessage:any;

  constructor(private httpService:HttpService,private fb:FormBuilder)
  {

  }
  
  ngOnInit(): void 
  {
    this.itemForm=this.fb.group(
      {
        name:['',[Validators.required]],
        location:['',[Validators.required]]
      }
    )
  }
 
  getHospital()
  {
    
  }

  onSubmit()
  {

  }

  Addequipment(value:any)
  {
    
  }

  submitEquipment()
  {

  }
 
}
