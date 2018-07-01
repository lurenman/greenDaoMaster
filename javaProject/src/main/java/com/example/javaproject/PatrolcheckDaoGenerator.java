package com.example.javaproject;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class PatrolcheckDaoGenerator extends libDaoGenerator {
    public final static String OUTPATH = "D:\\androidxm\\githubme\\greenDaoMaster\\javaProject\\src\\main\\java";
    public final static String PACKAGENAME = "com.example.javaproject.greendao";

    public static void main(String[] args) throws Exception {
        PatrolcheckDaoGenerator mPatrolcheckDaoGenerator = new PatrolcheckDaoGenerator();
        Schema schema = new Schema(16, PACKAGENAME);

        mPatrolcheckDaoGenerator.addAll(schema);

        new DaoGenerator().generateAll(schema, OUTPATH);

    }

    @Override
    public void addAll(Schema schema) {
        super.addAll(schema);

        addListDat(schema);
        addUerDat(schema);
    }


    private void addListDat(Schema schema) {
        Entity tb = schema.addEntity("ListData");

        tb.addIntProperty("detail_level");
        tb.addStringProperty("display_name");
        tb.addStringProperty("parent_id");
        tb.addStringProperty("user_id");

        tb.addStringProperty("user_id1");
        tb.addStringProperty("user_id2");
    }
    private void addUerDat(Schema schema) {
        Entity tb = schema.addEntity("CommonCheckType");
        tb.addIdProperty();
        tb.addStringProperty("user_name");
        tb.addStringProperty("check_parent_name");
        tb.addIntProperty("check_parent_id");
        tb.addStringProperty("check_name");
        tb.addIntProperty("check_id");
        tb.addIntProperty("check_count");

    }

}
