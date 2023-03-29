package com.example.emart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.emart.databinding.ActivityHomeBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class Home_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityHomeBinding binding;

    private TextView fullname,mail;

    private ImageView Home,Furniture,Electronics,Cosmetics,Grocery,logo;

    private View cart;
    private Button logout;
    private TextView Home_text,Furniture_text,Electronics_text,Cosmetics_text,Grocery_text;

    CardView card_furniture,card_electronics,card_cosmetics,card_grocery;


    FirebaseAuth fAuth;

    FirebaseFirestore fstore;
    String userId;

   FirebaseUser user;


    @Override
    protected void onStart() {
        super.onStart();
        user = FirebaseAuth.getInstance().getCurrentUser();
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHome.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);//by default title not dsplay only logo

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow).setOpenableLayout(drawer).build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        navigationView.bringToFront();
        NavigationView navigationView1 = (NavigationView) findViewById(R.id.nav_view);
        navigationView1.setNavigationItemSelectedListener(this);
        View headerview = navigationView.getHeaderView(0);

        fAuth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();

        userId = fAuth.getCurrentUser().getUid();




        fullname = findViewById(R.id.main_fullname);
        mail = findViewById(R.id.main_email);
        logo = findViewById(R.id.Applogo);
        Home = findViewById(R.id.Home);
        Furniture = findViewById(R.id.Furniture);
        Electronics = findViewById(R.id.Electronics);
        Cosmetics = findViewById(R.id.Cosmetics);
        Grocery = findViewById(R.id.Fresh);
        Home_text = findViewById(R.id.Home_text);
        Furniture_text = findViewById(R.id.Furniture_text);
        Electronics_text = findViewById(R.id.Electronics_text);
        Cosmetics_text = findViewById(R.id.Cosmetics_text);
        Grocery_text = findViewById(R.id.Fresh_text);
        card_furniture = findViewById(R.id.card_furniture);
        card_electronics = findViewById(R.id.card_Electronics);
        card_cosmetics = findViewById(R.id.card_Cosmetics);
        card_grocery = findViewById(R.id.card_Grocery);
        cart = findViewById(R.id.main_cart_icon);
        logout = findViewById(R.id.Logout);


        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(Home_Activity.this,Home_Activity.class);
                startActivity(Home);
            }
        });
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Home = new Intent(Home_Activity.this,Home_Activity.class);
                startActivity(Home);
            }
        });
        Furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent furniture = new Intent(Home_Activity.this,furnitureproductcard.class);
                startActivity(furniture);
            }
        });
        Furniture_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent furnituret = new Intent(Home_Activity.this,furnitureproductcard.class);
                startActivity(furnituret);
            }
        });
        Electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent electronics = new Intent(Home_Activity.this,electronicproductcard.class);
                startActivity(electronics);
            }
        });
        Electronics_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent electronicst = new Intent(Home_Activity.this,electronicproductcard.class);
                startActivity(electronicst);
            }
        });
        Cosmetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cosmetic = new Intent(Home_Activity.this,cosmeticproductcard.class);
                startActivity(cosmetic);
            }
        });
        Cosmetics_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cosmetict = new Intent(Home_Activity.this,cosmeticproductcard.class);
                startActivity(cosmetict);
            }
        });
        Grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent grocery = new Intent(Home_Activity.this,groceryproductcard.class);
                startActivity(grocery);
            }
        });
        Grocery_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent groceryt = new Intent(Home_Activity.this,groceryproductcard.class);
                startActivity(groceryt);
            }
        });
        card_furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Furniture_layout = new Intent(Home_Activity.this,furnitureproductcard.class);
                startActivity(Furniture_layout);
            }
        });
        card_electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent electronic_layout = new Intent(Home_Activity.this,electronicproductcard.class);
                startActivity(electronic_layout);
            }
        });
        card_cosmetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cosmetic_layout = new Intent(Home_Activity.this,cosmeticproductcard.class);
                startActivity(cosmetic_layout);
            }
        });
        card_grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent grocery_layout = new Intent(Home_Activity.this,groceryproductcard.class);
                startActivity(grocery_layout);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(Home_Activity.this,MainActivity.class);
                logout.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(logout);
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_, menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.search_icon){//to search icon
            return true;
        } else if (id == R.id.main_cart_icon) {//to cart
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public boolean onNavigationItemSelected(MenuItem menuItem){



        switch (menuItem.getItemId()){
            case R.id.nav_order:
                Intent order = new Intent(Home_Activity.this,myorder.class);
                startActivity(order);
                break;
            case R.id.nav_cart:
                Intent cart = new Intent(Home_Activity.this,mycart.class);
                startActivity(cart);
                break;
            case R.id.nav_my_Account:
                Intent account = new Intent(Home_Activity.this,myaccount.class);
                startActivity(account);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}