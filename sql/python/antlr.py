import sys
from antlr4 import *
from SQLiteLexer import SQLiteLexer
from SQLiteParser import SQLiteParser
# from HtmlSQLiteListener import HtmlSQLiteListener
 
def getTableName(sqlString):
    tableName = ""
    return tableName

def main(argv):
    input = FileStream(argv[1])
    lexer = SQLiteLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLiteParser(stream)
    tree = parser.SQLite()
 
    output = open("sqlOutput.txt","w")
    
#    htmlSQLite = HtmlSQLiteListener(output)
#    walker = ParseTreeWalker()
#    walker.walk(htmlSQLite, tree)
        
    output.close()      

def test(argv):
    print("this is a test")
 
if __name__ == '__main__':
#    main(sys.argv)
    test(sys.argv)
