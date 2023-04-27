package us.ak_tech.criminalintent.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import us.ak_tech.criminalintent.Crime
import java.util.*


@Dao
interface CrimeDao {
    @Query("SELECT * FROM Crime")
    suspend fun getCrimes(): List<Crime>

    @Query("SELECT * FROM Crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime

    @Update
    suspend fun updateCrime(crime: Crime)

    @Insert
    suspend fun addCrime(crime: Crime)
}