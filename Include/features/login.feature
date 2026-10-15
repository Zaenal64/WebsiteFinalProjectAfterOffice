Feature: Login JPetStore Menggunakan Data Files Database

  Scenario Outline: Login dengan data dari database berdasarkan baris data
    Given User membuka browser dan mengakses halaman login JPetStore
    When User mengambil kredensial login dari data file baris ke <row_index>
    And User menekan tombol Login
    Then Verifikasi hasil login untuk baris ke <row_index>

    Examples: 
      | row_index |
      | 1         |
      | 2         |
      | 3         |      
