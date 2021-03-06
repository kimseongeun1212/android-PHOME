package com.smu.team_andeu.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

// 아마 필요 하지 않을 것입니다.
@Dao
interface DexerDao {
    // Dexer 객체를 통해 insert 하는 함수 입니다.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(dexer: Dexer?)

    // 위험 : 모든 Phomer의 루틴안의 운동들이 다사라질 수 있는 함수입니다.
    @Query("DELETE FROM dexer_table")
    fun deleteAll()

    // Dexer의 Id로 부터 Dexer를 얻는 함수.
    @Query("SELECT * FROM dexer_table WHERE dexer_id = :dexer_id")
    fun getDexer(dexer_id: Int): LiveData<Dexer>

    // 초기 넣기 : 비동기식 처리중
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(routines: List<Dexer>)

}