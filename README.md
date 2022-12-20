# CalendarView
Apliakcja obliczająca długość podróży stworzona z użyciem kontrolki CalendarView


1. Działanie aplikacji:
    - Ustawienie daty wyjazdu oraz przyjazdu
    - Obliczenie długości między datami
    - Brak możliwości wybrania daty z przeszłości
    - Brak możliwości wybrania daty z dalszej przyszłości, ponad 2 lat
  
2. Niezawodność:
    - Po uruchomieniu się aplikacji następuje inicjowanie zmiennych oraz zapisanie aktualnej daty systemowej
    - Aplikacja składa się z tylko jednego okna, żadne inne nie wejdzie na pierwszy plan
    - Zatrzymanie działania wykonuje się poprzez kliknięcie systemowego przycisku zamknięcia programu, nic nie zostaje zapisane do pamięci cache, wszystkie dane są usuwane
    - Po ponownym wejściu w aplikację wszystkie dane są odczytywane na nowo
    - Aplikacja nie wymaga dużo pamięci, nie ma ustalonych również priorytetów co do zużycia pamięci
    - W przypadku "zabicia" aplikacji wszystkie dane są resetowane do stanu początkowego
    - Aplikacja nie posiada żadnych działań końcowych
  
3. Funkcjonalność:
    - Po uruchomieniu aplikacji widać kalendarz (CalendarView) oraz dwa przyciski: jeden z napisem "Wyjazd", drugi z napisem "Przyjazd"
    - Zablokowane jest wybranie daty wstecz, na podstawie aktualnej daty systemowej
    - Zablokowane jest wybranie daty dalszej niż 2 lata
    - Po wybraniu daty na kalendarzu i wciśnięciu przycisku "Wyjazd", program zapisuje datę wyjazdu i wyświetla ją poniżej danego przycisku
    - Po wybraniu daty na kalendarzu i wciśnięciu przycisku "Przyjazd", program zapisuje datę przyjazdu i wyświetla ją poniżej danego przycisku
    - W przypadku wybraniu obu dat program oblicza długość podróży w dniach i wyświetla ją poniżej
    - Jeśli data przyjazdu jest wcześniejsza od daty wyjazdu to zostanie wyświetlony napis: "Nie można cofnąć się w czasie"
    - Jeśli data wyjazdu i przyjazdu jest taka sama program wypisze "Powrót tego samego dnia"
    - Po zamknięciu aplikacji wszystkie dane są zerowane
  
4. Weryfikacja i testowanie:
    - Aplikacja uniemożliwiła wybrania daty wcześniejszej od akltualnej daty systemowej oraz daty z dalszej przyszłości, tzn. ponad 2 lat
    - Po wybraniu daty wyjazdu na kalendarzu i wciśnięciu przycisku "Wyjazd", program pod przyciskiem wypisał "Wyjazd: "2022.12.18
    - Po wybraniu daty przyjazdu na kalendarzu i wciśnięciu przycisku "Przyjazd", program pod tym przyciskiem wypisał "Przyjazd: 2022.12.24
    - Po wybramiu obu dat program od razu poniżej wypisał "Długość wycieczki: 6 dni"
    - W przypadku wybrania daty przyjazdu wcześniejszej niż datę, odrwotność z poprzedniego testu (Przyjazd: 2022.12.18; Wyjazd: 2022.12.22), program wypisał "Nie można cofnąć się w czasie"
    - Jeśli użytkownik najpierw poda datę przyjazdu, a potem datę wyjazdu, ale data wyjazdu będzie wcześcniejsza od daty przyjazdu, program normalnie obliczył i wypisał ilość dni
    - Po wybraniu takiej samej daty wyjazdu co przyjazdu program wypisał "Powrót tego samego dnia"
