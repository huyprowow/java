package Test;//Test.BinarySemaphore mutex(true); Test.CountingSemaphore isFull(size), isEmpty(0)


public class ProcedureConsumer {
    public class Procedure{
        void deposit() {
            //isFull.P(); day luong vao day thi khoa
            // mutex.P(); thay doi trang thai dam bao loai tru lan nhau (chi 1 luong truy cap tai 1 td)
            //<Ghi dữ liệu vào bộ đệm> dua luong vao hang doi xl
            //mutex.V(); thay doi trang thai giai phong cho phep luong truy cap
            //isEmpty.V(); chua day danh thuc luong
        }
    }
    public class Consumer {
        void fetch() {
            //isEmpty.P(); tieu thu het thi khoa
            //mutex.P(); thay doi trang thai dam bao loai tru lan nhau (chi 1 luong truy cap tai 1 td)
            //<Lấy dữ liệu ra khỏi bộ đệm>
            //mutex.V();thay doi trang thai giai phong cho phep luong truy cap
            //isFull.V(); danh thuc luong day
        }
    }
}
