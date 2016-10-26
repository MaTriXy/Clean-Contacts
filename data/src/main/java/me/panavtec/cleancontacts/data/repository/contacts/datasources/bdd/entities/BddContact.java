package me.panavtec.cleancontacts.data.repository.contacts.datasources.bdd.entities;

import com.j256.ormlite.field.DatabaseField;
import me.panavtec.cleancontacts.data.repository.caching.strategy.ttl.TtlCachingObject;

public class BddContact implements TtlCachingObject {

  public static final String FIELD_MD5 = "md5";
  public static final String FIELD_ID = "id";

  @DatabaseField(generatedId = true, columnName = FIELD_ID) private int id;
  @DatabaseField public String gender;
  @DatabaseField(foreign = true, foreignAutoRefresh = true) public BddName name;
  @DatabaseField(foreign = true, foreignAutoRefresh = true) public BddLocation location;
  @DatabaseField public String email;
  @DatabaseField public String username;
  @DatabaseField public String password;
  @DatabaseField public String salt;
  @DatabaseField(columnName = FIELD_MD5) public String md5;
  @DatabaseField public String sha1;
  @DatabaseField public String sha256;
  @DatabaseField public String registered;
  @DatabaseField public String dob;
  @DatabaseField public String phone;
  @DatabaseField public String cell;
  @DatabaseField public String ssn;
  @DatabaseField(foreign = true, foreignAutoRefresh = true) public BddPicture picture;
  @DatabaseField public String version;
  @DatabaseField public long persistedTime;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public BddName getName() {
    return name;
  }

  public void setName(BddName name) {
    this.name = name;
  }

  public BddLocation getLocation() {
    return location;
  }

  public void setLocation(BddLocation location) {
    this.location = location;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  public String getRegistered() {
    return registered;
  }

  public void setRegistered(String registered) {
    this.registered = registered;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCell() {
    return cell;
  }

  public void setCell(String cell) {
    this.cell = cell;
  }

  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public BddPicture getPicture() {
    return picture;
  }

  public void setPicture(BddPicture picture) {
    this.picture = picture;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override public long getPersistedTime() {
    return persistedTime;
  }

  public void setPersistedTime(long persistedTime) {
    this.persistedTime = persistedTime;
  }
}
