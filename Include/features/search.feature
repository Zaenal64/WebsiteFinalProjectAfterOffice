Feature: Menggunakan Fitur search bar

  Scenario Outline: Berhasil dan gagal menggunakan fitur search bar
  	Given user berada pada halaman dashboard
    When user melakukan input "<nama_hewan>"
    And User menekan tombol search
    Then Verifikasi hasil search bar untuk status "<status>" dengan ID "<product_id>", nama "<product_name>", dan deskripsi "<description>"

    Examples:
      | nama_hewan        | status    | product_id | product_name     | description                               |
      | Goldfish          | FOUND     | FI-FW-02   | Goldfish         | Fresh Water fish from China               |
      | Golden Retriever  | FOUND     | K9-RT-01   | Golden Retriever | Great family dog                          |
      | Rattlesnake       | FOUND     | RP-SN-01   | Rattlesnake      | Doubles as a watch dog                    |
      | Persian           | FOUND     | FL-DLH-02  | Persian          | Friendly house cat, doubles as a princess |
      | Amazon Parrot     | FOUND     | AV-CB-01   | Amazon Parrot    | Great companion for up to 75 years        |
      | Manchester United | NOT_FOUND |            |                  |                                           |
      |                   | EMPTY     |            |                  |                                           |
