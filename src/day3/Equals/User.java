package day3.Equals;

public class User {
    private String username;
    private String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;
    }

    // method equals juga bisa di override untuk bandigin 1 field atau beberapa field aja dlam object
    public boolean equals(Object obj){
        if(this == obj) return true; // pertama cek jika object nya sma
        // cek apa objectnya null atau bukan instance/class User
        if(obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj; // Dowcast object ke user
        // bandingkan ke username dan email
        return username.equals(user.username) && email.equals(user.email);
    }
    public String getData(){return  "username" + username + "email" + email;}
    public String getUsername(){return username;}
}
