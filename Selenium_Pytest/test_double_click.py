import pytest
import time
from selenium.webdriver.common.action_chains import ActionChains


def test_doubleclickCheck(test_checkurl,test_common):

    un=test_common[0].find_element_by_id('username')
    un.send_keys('Avani')

    action=ActionChains(test_common[0])
    action.double_click(un).perform()

    time.sleep(2)
    un.clear()      # clear the data
    un.send_keys('Kuman')  # pass the new data bcz we double click it so it is selected already. so we can clear it and pass the new data.

    time.sleep(2)

    test_common[0].close()