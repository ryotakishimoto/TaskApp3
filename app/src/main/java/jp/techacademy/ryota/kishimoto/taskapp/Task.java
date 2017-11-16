package jp.techacademy.ryota.kishimoto.taskapp;

/**
 * Created by ryotakishimoto on 2017/11/13.
 */
import java.io.Serializable;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

//Realmに保存されている一覧

public class Task extends RealmObject implements Serializable {
    private String title; // タイトル
    private String contents; // 内容
    private String category; //カテゴリーを追加した
    private Date date; // 日時

    // id をプライマリーキーとして設定
    @PrimaryKey
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory(){ return category; }
    public void setCategory(String category){ this.category = category; }//カテゴリーを追加した

}