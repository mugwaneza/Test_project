package models;

import play.db.ebean.Model;

import javax.persistence.Id;

/**
 * Created by alexis on 3/14/2016.
 */
public class Bar extends Model{


    @Id
    public String id;
    public String name;



}
