package com.sb.tocaraul.adapter

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import android.content.ContentValues
import android.util.Log

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // TODO(developer): Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        Log.d(ContentValues.TAG, "From: " + remoteMessage.from)
        Log.d(
            ContentValues.TAG, "Notification Message Body: " + remoteMessage.notification!!
                .body
        )
    }
}