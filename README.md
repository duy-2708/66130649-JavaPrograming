# 66130649-JavaPrograming
Đã thay đổi
-Thay đổi rất nhiều rồi 
* **Lớp chính:** `Main`
* **Kiến thức:** JavaFX Layout (`GridPane`, `HBox`, `VBox`), Event Handling (Lambda Expression `e ->`), Exception Handling (`try-catch`, `NumberFormatException`), `Alert` Dialog (Hiển thị hộp thoại cảnh báo dạng Modal).

<p align="center">
  <img src="./IMG_Java/giao_dien.png.png" width="300" alt="Giao diện chính">
  <img src="./IMG_Java/bao_loi.png.png" width="300" alt="Thông báo lỗi">
</p>
## ⚙️ Quá Trình Hoạt Động Của Ứng Dụng (BMI Calculator)

Ứng dụng vận hành khép kín theo một chu trình tuần tự từ lúc khởi tạo cho đến khi xuất kết quả hoặc báo lỗi ra màn hình thông qua các bước cụ thể sau:

### Bước 1: Khởi tạo và Bố trí Layout (UI Initialization)
* Khi chương trình được kích hoạt, hàm `start(Stage primaryStage)` chạy để dựng khung cửa sổ.
* Hệ thống kết hợp linh hoạt giữa các Layout:
  * **`GridPane`**: Làm bố cục cốt lõi ở trung tâm để căn chỉnh các nhãn chữ (`Text`) và ô nhập liệu (`TextField`) thẳng hàng theo dạng lưới tọa độ.
  * **`HBox` / `VBox`**: Gom nhóm các nút bấm điều khiển (`Tính toán`, `Xóa`) hoặc các khối thành phần theo hàng ngang/hàng dọc để tạo khoảng cách thẩm mỹ và phân vùng rõ ràng.

### Bước 2: Tiếp nhận dữ liệu & Lắng nghe sự kiện (Event Handling)
* Ứng dụng luôn ở trạng thái chờ hành động từ người dùng. Khi người dùng nhập số liệu và nhấn nút **"Tính toán"**, trình lắng nghe sự kiện xử lý bằng biểu thức Lambda (`e ->`) sẽ lập tức được kích hoạt để bắt lấy luồng xử lý.
* Hệ thống thực hiện gọi phương thức `.getText()` trên các ô `TextField` để lấy ra chuỗi ký tự cân nặng và chiều cao.

### Bước 3: Kiểm soát và Lọc ngoại lệ dữ liệu (Exception Handling)
* Trước khi đưa vào tính toán, các chuỗi ký tự được ép kiểu sang số thực dấu phẩy động (`Double.parseDouble`).
* Toàn bộ quá trình ép kiểu này được bao bọc chặt chẽ trong khối lệnh `try-catch`.
* **Kịch bản bắt lỗi:** Nếu người dùng để trống ô nhập hoặc cố tình nhập chữ cái, hệ thống sẽ ném ra ngoại lệ `NumberFormatException`. Ngay lập tức, khối `catch` sẽ bắt lấy lỗi này và kích hoạt một hộp thoại cảnh báo **`Alert` Dialog (loại ALERT_TYPE.ERROR)** dạng Modal để khóa màn hình và yêu cầu người dùng nhập lại số hợp lệ, ngăn chặn hoàn toàn việc ứng dụng bị crash gãy giữa chừng.

### Bước 4: Chuẩn hóa dữ liệu & Thực thi thuật toán
* Nếu dữ liệu vượt qua vòng kiểm tra, hệ thống tiến hành kiểm tra điều kiện chiều cao: Nếu giá trị nhập vào lớn hơn 3 (người dùng quen tay nhập đơn vị cm thay vì mét, ví dụ `170`), hệ thống tự động quy đổi bằng cách chia cho `100` để đưa về mét (`1.7`).
* Ứng dụng áp dụng công thức toán học: `BMI = Cân nặng / (Chiều cao * Chiều cao)`.

### Bước 5: Phản hồi giao diện trực quan (UI Update)
* Kết quả chỉ số BMI sau khi tính xong sẽ được đưa vào cấu trúc rẽ nhánh `if-else` để phân loại thể trạng (Gầy, Cân đối, Béo).
* Tùy thuộc vào kết quả, hệ thống tiến hành cập nhật trực tiếp lên dòng chữ kết quả hiển thị trên giao diện, đồng thời đổi màu sắc chữ (`Color.BLUE`, `Color.GREEN`, `Color.RED`) để người dùng dễ dàng nhận biết trạng thái sức khỏe bằng thị giác.
* Khi nhấn nút **"Xóa"**, một sự kiện Lambda khác sẽ làm sạch (`.clear()`) các ô dữ liệu cũ, đưa ứng dụng về trạng thái sẵn sàng cho lượt tính tiếp theo.
<p align="center">
  <img src="./IMG_Java/Screenshot 2026-05-31 141339.png" width="300" alt="Giao diện chính">
  <img src="./IMG_Java/Screenshot 2026-05-31 141408.png" width="300" alt="Thông báo lỗi">
  <img src="./IMG_Java" width="300" alt="Thông báo lỗi">
</p>