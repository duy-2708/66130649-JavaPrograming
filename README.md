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
  <img src="./IMG_Java/Screenshot 2026-05-31 141420.png" width="300" alt="Thông báo lỗi">
</p>
## 🎮 Hướng Dẫn Sử Dụng & Cách Chơi (Game Caro 3x3)

Trò chơi vận hành trực quan dành cho hai người chơi đối kháng trực tiếp trên cùng một máy tính. Quá trình tương tác và sử dụng ứng dụng diễn ra tuần tự theo các bước sau:

### Bước 1: Khởi động ván đấu & Nhận diện lượt đi
* Ngay khi ứng dụng được kích hoạt, một bàn cờ trống kích thước 3x3 vuông vức sẽ hiện ra ở chính giữa màn hình.
* Trên cùng thanh trạng thái (`Top` của khuôn BorderPane) sẽ hiển thị dòng chữ thông báo mặc định: **"Lượt của: X"**. Theo luật chơi, quân **X** luôn là bên được quyền khai cuộc đi trước.

### Bước 2: Thao tác đặt quân (Đánh cờ)
* Người chơi di chuyển con trỏ chuột và click vào bất kỳ ô vuông trống nào trên bàn cờ để hạ quân.
* **Hiệu ứng phản hồi trực quan từ giao diện:**
  * Nếu đang là lượt của **X**: Ô được chọn sẽ xuất hiện chữ **X màu đỏ**, đồng thời thanh thông báo phía trên lập tức đổi thành *"Lượt của: O"*.
  * Nếu đang là lượt của **O**: Ô được chọn sẽ xuất hiện chữ **O màu xanh dương**, đồng thời thanh thông báo lập tức đổi về *"Lượt của: X"*.

### Bước 3: Luật chơi an toàn (Chống thao tác sai)
* **Chống đánh đè:** Hệ thống tích hợp bộ lọc chặn dữ liệu ngầm. Khi một ô đã được đánh (đã chứa X hoặc O), việc người chơi cố tình click lại vào ô đó sẽ bị bỏ qua hoàn toàn, không thể ghi đè quân cờ khác lên.
* **Đóng băng bàn cờ:** Khi trận đấu đã phân định kết quả (Thắng/Thua/Hòa), toàn bộ 9 ô cờ sẽ tự động rơi vào trạng thái khóa, người chơi không thể bấm thêm bất kỳ nước đi nào khác nhằm giữ nguyên hiện trạng bảng đấu.

### Bước 4: Nhận diện kết quả trận đấu
* Hệ thống tự động quét ma trận sau mỗi click chuột. Khi một trong hai người chơi xếp đủ 3 quân cờ của mình thành một đường thẳng hàng (áp dụng cho cả hàng ngang, cột dọc, đường chéo chính hoặc đường chéo phụ):
  * Dòng thông báo trên cùng sẽ chuyển sang **Màu xanh lá** chói hiển thị: **"X CHIẾN THẮNG!"** hoặc **"O CHIẾN THẮNG!"**.
* Trong trường hợp toàn bộ 9 ô cờ đã bị lấp đầy nhưng không có bất kỳ ai tạo được đường 3 ô thẳng hàng, thanh trạng thái sẽ chuyển sang **Màu cam** thông báo: **"TRẬN NÀY HÒA!"**.

### Bước 5: Khởi tạo ván mới (Reset)
* Khi muốn kết thúc ván cũ để bắt đầu một hiệp đấu mới, người chơi click vào nút **"Chơi Lại"** nằm chễm chệ ở góc dưới cùng (`Bottom` của BorderPane).
* Ngay lập tức, toàn bộ dữ liệu cũ sẽ được quét sạch, các ô cờ trở về trạng thái trống rỗng, dòng thông báo trả lại chữ màu đen mặc định và quyền đi trước được thiết lập lại cho lượt của X.
<p align="center">
  <img src="./IMG_Java/Screenshot 2026-05-31 141819.png" width="300" alt="Giao diện chính">
  <img src="./IMG_Java/Screenshot 2026-05-31 141838.png" width="300" alt="Thông báo lỗi">
  <img src="./IMG_Java/Screenshot 2026-05-31 141901.png" width="300" alt="Thông báo lỗi">
</p>