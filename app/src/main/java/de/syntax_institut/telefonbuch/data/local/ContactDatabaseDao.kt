package de.syntax_institut.telefonbuch.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import de.syntax_institut.telefonbuch.data.datamodels.Contact


@Dao
interface ContactDatabaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(contact: Contact)

    @Update
    suspend fun update(contact: Contact)

    @Query("SELECT * FROM Contact")
    fun getAll(): LiveData<List<Contact>>

    @Query("SELECT * FROM Contact WHERE id = :key")
    fun getById(key: String): LiveData<Contact>

    @Query("DELETE FROM Contact WHERE id = :id")
    suspend fun deleteById(id: Long)

    @Query("DELETE FROM Contact")
    suspend fun deleteAll()
}