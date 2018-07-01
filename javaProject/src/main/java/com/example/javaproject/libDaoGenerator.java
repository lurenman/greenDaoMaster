package com.example.javaproject;

import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class libDaoGenerator {

	public void addAll(Schema schema) {
		addISSUE_CACHE_ENTITY(schema);
		addPROPERTY_DICT_ENTITY(schema);
		addSHORT_NOTE(schema);
	}

	private void addISSUE_CACHE_ENTITY(Schema schema) {
		Entity tb = schema.addEntity("IssueCacheEntity");

		tb.addIdProperty();
		// tb.addLongProperty("id").primaryKey();
//		tb.addStringProperty("userName").notNull();
//		tb.addStringProperty("subject").notNull();
		tb.addStringProperty("userName");
		tb.addStringProperty("subject");
		tb.addStringProperty("occurOrgId");
		tb.addStringProperty("issueKindId");
		tb.addStringProperty("occurOrgInternalCode");
		tb.addStringProperty("occurLocation");
		tb.addStringProperty("mainCharacters");
		tb.addStringProperty("issueContent");
		tb.addStringProperty("relatePeopleCount");

		tb.addStringProperty("isEmergency");
		tb.addStringProperty("important");
		tb.addStringProperty("lon");
		tb.addStringProperty("lat");
		tb.addStringProperty("occurDate");
		tb.addStringProperty("uniqueIdForMobile");
		tb.addStringProperty("files");
		tb.addStringProperty("firstType");
		tb.addStringProperty("secondType");
		tb.addStringProperty("imgFileArray");
		tb.addStringProperty("soundFileArray");

		/**
		 * Version:3
		 */
		tb.addStringProperty("firstTypeId");
		tb.addStringProperty("secondTypeId");

	}

	private void addPROPERTY_DICT_ENTITY(Schema schema) {
		Entity tb = schema.addEntity("PropertyDictEntity");
		tb.addIdProperty();
		// tb.addLongProperty("id").primaryKey();
		//tb.addStringProperty("propertyName").notNull();
		tb.addStringProperty("propertyName").unique();
		tb.addStringProperty("propertyData");
	}

	private void addSHORT_NOTE(Schema schema) {
		Entity tb = schema.addEntity("ShortNote");
		tb.addIdProperty();
		// tb.addLongProperty("id").primaryKey();
		tb.addStringProperty("desc");

		tb.addStringProperty("lon");
		tb.addStringProperty("lat");
		tb.addStringProperty("address");
		tb.addStringProperty("dateTime");
		tb.addStringProperty("imgFileArray");
		tb.addStringProperty("soundFileArray");
	}

}
