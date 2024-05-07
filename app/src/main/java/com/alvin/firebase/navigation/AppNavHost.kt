package com.alvin.firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.alvin.firebase.ui.theme.Screen.home.HomeScreen
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alvin.firebase.ui.theme.Screen.login.LoginScreen
import com.alvin.firebase.ui.theme.Screen.products.AddProductsScreen
import com.alvin.firebase.ui.theme.Screen.products.UpdateProductsScreen
import com.alvin.firebase.ui.theme.Screen.products.ViewProductsScreen
import com.alvin.firebase.ui.theme.Screen.products.ViewUploadsScreen
//import com.alvin.firebase.ui.theme.Screen.products.AddProductsScreen
//import com.alvin.firebase.ui.theme.Screen.products.UpdateProductsScreen
//import com.alvin.firebase.ui.theme.Screen.products.ViewProductsScreen
//import com.alvin.firebase.ui.theme.Screen.products.ViewUploadsScreen
import com.alvin.firebase.ui.theme.Screen.register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_LOGIN)
{

    NavHost(navController = navController,modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)

        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ADD_PRODUCT) {
            AddProductsScreen(navController)
        }
        composable(ROUTE_VIEW_PRODUCT){
            ViewProductsScreen(navController)
        }
        composable(ROUTE_UPDATE_PRODUCT+ "/{id}"){passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }

}