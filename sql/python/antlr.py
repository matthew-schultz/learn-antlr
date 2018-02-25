import sys
from antlr4 import *
from SQLiteLexer import SQLiteLexer
from PrintSQLiteListener import PrintSQLiteListener
from SQLiteParser import SQLiteParser
# from HtmlSQLiteListener import HtmlSQLiteListener
 
def getTableName(sqlString):
    tableName = ""
    return tableName

def main(argv):
    input = FileStream(argv[1])
#    print(input)
    lexer = SQLiteLexer(input)
    stream = CommonTokenStream(lexer)
    parser = SQLiteParser(stream)
    tree = parser.sql_stmt()
#    print(tree)
    output = open("sqlOutput.txt","w")
    
    SQLite = PrintSQLiteListener()
    walker = ParseTreeWalker()
    walker.walk(SQLite, tree)
#    print(tree)    
    output.close()      

def test(argv):
    print("this is a test")
 
if __name__ == '__main__':
    if(len(sys.argv) >= 2):
        main(sys.argv)
    else:
        print(__file__ + ': ERROR need at least 2 arguments to run properly (e.g. \"python3 antlr.py books.sql\"')
#    test(sys.argv)
