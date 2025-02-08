package day3.ExceptionHandling;
import java.util.Objects;

/* EXCEPTION HANDLING : error handling ketika ada operasi yang gagal
* macam amcam error handling:
* -IllegalArgumentException : error handling untuk argumen/parameter yang dikirim/terima
* -ArrayIndexOutOfBoundsException: error handling data array
* -IOException : error handling untuk operasi file
* -ArithmeticException : error handling operasi matimatka
* -ResourceNotFoundException : error handling resource (404 not found)
* -BadRequestException : error handling untuk (400 bad request)
* -UnauthorizedException:  error handling unauthorized(401 unauthorrized)
* -ForbiddenException : error handling akses otoritasi(403 forbidden)
* -InternalSeverException: error internal server (500 internal server error)
* -Error : error handling universal
* */
public class Main {
    static  void  checkRole(String role){
        // equals buat ngecek data yang dikirim dari parameter
        if(Objects.equals(role, "user")){
            // respon error manual
            throw new IllegalArgumentException("Access denied only admin can access!");
        }else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try{
            // panggil method nya
            checkRole("user");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
