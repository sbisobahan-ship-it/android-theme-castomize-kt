
// শুধু ডার্ক ডার্ক লিম করার জন্য সবসময় ডার্ক থাকবে 
// উল্লেখ্য এখানে এই ফাইল মেইন এক্টিভিটির নিচে রাখতে হবে বা সাথে রাখতে হবে 
// এই ফাইল ব্যবহার করলে এপ রান হলে তখন এই ডার্ক থিম কাজ করে তাই এখানে এপের শুরুতে লাইট মুডে ডিফোল্ট একটি লাইট স্ক্রিন সো করে তাই এটাকে ঠিক করতে 
//res/values/themes.xml (প্রথম ফাইল ) ফাইলে অতিরিক্ত কোড যোগ করতে হবে যা নিচে আর একটি  ফাইলে দেওয়া হলো 
package com.buildbdapp.graphio

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class GraphioApp : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(
            AppCompatDelegate.MODE_NIGHT_YES
        )
    }
}

