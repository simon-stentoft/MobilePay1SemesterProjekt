package sample;

public class Bruger {
    private String name;
    private int phone;
    private String Email;
    private int kontonr, kontrolcifre;
    private String expirationdate;
    private String username, password;
    private int userBalance;
    private int amount;


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



    public String getExpirationdate() {
        return expirationdate;}
    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;}



    public String getUserName() {
        return username;}
    public void setUserName(String username) {
        this.username = username;}



    public String getpassword() {
        return password;}
    public void setpassword(String password) {
        this.password = password;
    }


    public int getUserBalance() {
        return userBalance;}
    public void setUserBalance(int userBalance) {
        this.userBalance = userBalance;}


    public int getAmount() {
        return amount;}
    public void setAmount(int amount) {
        this.amount = amount;}
}
