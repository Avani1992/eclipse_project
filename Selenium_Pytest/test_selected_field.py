import pytest
import time
from selenium.webdriver.support.ui import Select

def test_selectedData(test_select,test_common):
    lists=test_common[0].find_element_by_id('select')
    s1=Select(lists)  # use Select class pass lists as argument which is webelement.

    s2=s1.options  # list of all data
    for i in range(0,len(s2)):
        if(i%2==0):

            s1.select_by_index(i)
            text=s2[i].text
            print(text)
            time.sleep(1)
            s1.deselect_by_index(i)
            time.sleep(1)

    time.sleep(2)
    test_common[0].close()


