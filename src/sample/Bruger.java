package sample;

public class Bruger {
    private String Fnavn;
    private int phone;
    private String Email;
    private int kontoNr,kontrolCifre;
    private int expirationDate_M,expirationDate_y;
    private String userName, kode;


    public String getFnavn() {
        return Fnavn;}
    public void setFnavn(String fnavn) {
        Fnavn = fnavn;}


    public int getPhone() {
        return phone;}
    public void setPhone(int phone) {
        this.phone = phone;}



    public String getEmail() {
        return Email;}
    public void setEmail(String email) {
        Email = email;}



    public int getKontoNr() {
        return kontoNr;}
    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;}



    public int getKontrolCifre() {
        return kontrolCifre;}
    public void setKontrolCifre(int kontrolCifre) {
        this.kontrolCifre = kontrolCifre;}



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
