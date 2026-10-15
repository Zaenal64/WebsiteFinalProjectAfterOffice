Feature: User dapat direct halaman produk dari navbar

  Background:
    Given user berada pada halaman dashboard

  Scenario Outline: User dapat klik produk di navbar dan kembali ke dashboard
    When user klik produk "<produk>" di navbar
    Then user diarahkan ke halaman produk "<produk>"

    Examples:
      | produk            |
      | Fish              |
      | Dogs              |
      | Cats              |
      | Reptiles          |
      | Birds             |
      | Manchester United |
