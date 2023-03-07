package com.example.mui_userform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import com.example.mui_userform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), RadioGroup.OnCheckedChangeListener,
    CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    var gender:String?=null
    var arrayList:ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.rediogroup.setOnCheckedChangeListener(this)
        binding.coding.setOnCheckedChangeListener(this)
        binding.makingFriends.setOnCheckedChangeListener(this)
        binding.readNewsPaper.setOnCheckedChangeListener(this)


        binding.submit.setOnClickListener(this)






    }
    override fun onClick(p0: View?) {
        when(p0?.id){

           R.id.submit->{
               if (binding.firstName.editableText!!.isEmpty()&&binding.lastname.editableText!!.isEmpty()

                   && binding.mobileNo.editableText!!.isEmpty()&&binding.AlNo.editableText!!.isEmpty()
                   && binding.Email.editableText!!.isEmpty()){
                   Toast.makeText(this,"please fill required value",Toast.LENGTH_SHORT).show()
               }
               else if(binding.firstName.editableText!!.isEmpty()){
                   Toast.makeText(this,"Please enter Firstname",Toast.LENGTH_SHORT).show()
                   binding.firstName.requestFocus()

               }

               else if(binding.lastname.editableText!!.isEmpty()){
                   Toast.makeText(this,"Please enter last name",Toast.LENGTH_SHORT).show()
                   binding.lastname.requestFocus()

               }
               else if(binding.mobileNo.editableText!!.isEmpty()){
                   Toast.makeText(this,"Please enter Phone number",Toast.LENGTH_SHORT).show()
                   binding.mobileNo.requestFocus()

               }
               else if(binding.AlNo.editableText!!.isEmpty()){
                   Toast.makeText(this,"Please enter Alternet Phone number",Toast.LENGTH_SHORT).show()
                   binding.AlNo.requestFocus()

               }

               else if(binding.Email.editableText!!.isEmpty()){
                   Toast.makeText(this,"Please enter your Email",Toast.LENGTH_SHORT).show()
                   binding.Email.requestFocus()

               }

               else if(binding.mobileNo.editableText?.toString().equals(binding.AlNo.editableText!!.toString())){
                   Toast.makeText(this,"plese fill diffrent number",Toast.LENGTH_SHORT).show()
               }

               else
               {







               }
           }

        }
    }



































    override fun onCheckedChanged(chacked: RadioGroup?, p1: Int) {
        when(chacked?.checkedRadioButtonId){
            R.id.male->{
                 gender= binding.male.text.toString()
            }
            R.id.female->{
                 gender = binding.female.text.toString()
            }
            R.id.Tr_gender->{
                 gender = binding.TrGender.text.toString()
            }
        }
    }

    override fun onCheckedChanged(view: CompoundButton?, isCheked: Boolean) {

        when(view?.id){
            R.id.coding->{
                if (binding.coding.isChecked){
                   arrayList.add(binding.coding.text.toString())
                }
                else{
                    arrayList.remove(binding.coding.text.toString())
                }
            }
            R.id.making_friends->{
                if (binding.makingFriends.isChecked){
                    arrayList.add(binding.makingFriends.text.toString())
                }
                else{
                    arrayList.remove(binding.makingFriends.text.toString())
                }
            }


            R.id.read_news_paper->{
                if (binding.readNewsPaper.isChecked){
                    arrayList.add(binding.readNewsPaper.text.toString())
                }
                else{
                    arrayList.remove(binding.readNewsPaper.text.toString())
                }
            }


        }
    }



}



























