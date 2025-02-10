package com.example.recipeapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Parcelize is used when passing complex data types. It basically creates string for the transfer and recreates the object in the end destination. (Serialization and Deserialization)
// (Needs to be imported in plugins)
@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
): Parcelable

data class CategoriesResponse(val categories: List<Category>)

// https://www.themealdb.com/api/json/v1/1/categories.php