Feature: User dapat direct halaman produk dari side bar

  Background:
    Given user berada pada halaman dashboard

  Scenario Outline: User dapat klik produk di side bar dan kembali ke dashboard
    When user klik produk "<produk>" di side bar
    Then user diarahkan ke halaman produk "<produk>"

    Examples:
      | produk            |
      | Fish              |
      | Dogs              |
      | Cats              |
      | Reptiles          |
      | Birds             |
      | Manchester United |
