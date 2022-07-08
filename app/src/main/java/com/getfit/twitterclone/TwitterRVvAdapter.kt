package com.getfit.twitterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRVvAdapter (var tweets:List<Twitter>):
    RecyclerView.Adapter<TweetViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
            var itemView=LayoutInflater.from((parent.context))
                .inflate(R.layout.twitter_list_iteams,parent,false)
            return TweetViewHolder(itemView)


    }


    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currenttweets=tweets.get(position)
        holder.tvName.text=currenttweets.Name
        holder.tvHandle.text=currenttweets.Handle
        holder.tvDate.text=currenttweets.Date
        holder.tvProfile.text=currenttweets.profile

    }


        override fun getItemCount(): Int {

            return tweets.size

        }
}
class  TweetViewHolder(itemView:View):
    RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvProfile=itemView.findViewById<TextView>(R.id.tvProfile)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
//    var imgavatar=itemView.findViewById<ImageView>(R.id.imgavatar)
////    var imgLove=itemView.findViewById<ImageView>(R.id.imgLove)
////    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
////    var imgMessages=itemView.findViewById<ImageView>(R.id.imgmessages)
////    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)

}

