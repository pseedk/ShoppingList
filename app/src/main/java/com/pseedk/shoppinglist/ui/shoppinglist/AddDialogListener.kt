package com.pseedk.shoppinglist.ui.shoppinglist

import com.pseedk.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}