package sample;

public class Bruger {
    private String Fnavn;
    private int phone;
    private String Email;
    private int kontoNr,kontrolCifre;
    private int expirationDate_M,expirationDate_y;
    private String userName, kode;


    public Bruger(String name, int phone, String email, int kontonr, int kontrolcifre, String expirationdate, String username, String password, int userBalance, int amount) {
        this.name = name;
        this.phone = phone;
        Email = email;
        this.kontonr = kontonr;
        this.kontrolcifre = kontrolcifre;
        this.expirationdate = expirationdate;
        this.username = username;
        this.password = password;
        this.userBalance = userBalance;
        this.amount = amount;
    }

    public String getname() {
        return name;}
    public void setname(String name) {
        this.name = name;}


    public int getPhone() {
        return phone;}
    public void setPhone(int phone) {
        this.phone = phone;}



    public String getEmail() {
        return Email;}
    public void setEmail(String email) {
        Email = email;}



    public int getKontonr() {
        return kontonr;}
    public void setKontonr(int kontonr) {
        this.kontonr = kontonr;}



    public int getKontrolcifre() {
        return kontrolcifre;}
    public void setKontrolcifre(int kontrolcifre) {
        this.kontrolcifre = kontrolcifre;}



    public int getExpirationDate_M() {
        return expirationDate_M;}
    public void setExpirationDate_M(int expirationDate_M) {
        this.expirationDate_M = expirationDate_M;}



    public int getExpirationDate_y() {
        return expirationDate_y;}
    public void setExpirationDate_y(int expirationDate_y) {
        this.expirationDate_y = expirationDate_y;}



    public String getUserName() {
        return userName;}
    public void setUserName(String userName) {
        this.userName = userName;}



    public String getKode() {
        return kode;}
    public void setKode(String kode) {
        this.kode = kode;}
}
