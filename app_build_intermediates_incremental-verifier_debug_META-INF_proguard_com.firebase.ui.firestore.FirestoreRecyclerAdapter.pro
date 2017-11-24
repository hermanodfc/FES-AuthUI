# Generated keep rule for Lifecycle observer adapter.
-keep class com.firebase.ui.firestore.FirestoreRecyclerAdapter_LifecycleAdapter {
   ifused class com.firebase.ui.firestore.FirestoreRecyclerAdapter {
       <init>(...);
   };
}
