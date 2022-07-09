package com.getfit.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.getfit.twitterclone.databinding.ActivityMainBinding


    class MainActivity : AppCompatActivity() {
        lateinit var  binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding=ActivityMainBinding.inflate((layoutInflater))
            setContentView(binding.root)
            dispalyTwitts()
        }
        fun dispalyTwitts(){
            var contact = Twitter("Linda","Hildamoraa@gmail.com","I have all it takes to live my dream","4hhs",)
            var contact1= Twitter("laura","carolynmutuku","0727450674","2days")
            var contact2= Twitter("becky","Hildamoraa@gmail.com","I manifest I get","6days")
            var contact3= Twitter("Sheila","Hildamoraa@gmail.com","I trust that everything happens at te right time","2days")
            var contact4= Twitter("Fiona","Hildamoraa@gmail.com","countinue","2hrs",)
            var contactlist= listOf(contact,contact1,contact2,contact4,contact3)
            var contactadapter=TwitterRVvAdapter(contactlist)
            binding.rvTwitter.layoutManager=LinearLayoutManager(this)
            binding.rvTwitter.adapter=contactadapter

        }

    }


