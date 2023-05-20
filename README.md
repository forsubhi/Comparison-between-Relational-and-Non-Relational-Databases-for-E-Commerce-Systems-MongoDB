To create index for invoice details we can use the following command:

Text index:
db.invoiceDetail.createIndex( { "customerID": "text" } )
Ascending Index:
db.invoiceDetail.createIndex( { "customerID": 1 } )