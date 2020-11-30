package com.example.tabletraning.DataBase.DAOs;

import android.app.DownloadManager;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.tabletraning.DataBase.Model.Note;

import java.util.List;

@Dao
public interface NoteDao {


    @Insert
    void addNote(Note note);

    @Delete
    void deletNot(Note note);

   // @Query("delete from Note where id =:id " )
   // @Query("delete from Note where id =:id ")
    @Query("delete from Note where id =:id ")
    void deleteNote(int id);
     @Query("select * from Note Where title = :title")
     Note searchNoteByTitle(String title);

    @Query("select *  from Note")
     List<Note>getAllNote();
}
