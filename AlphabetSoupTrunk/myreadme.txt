RESOURCES
=========
- We need to create a file that contain position of Bucket so we don't have to figure out or compute it
- Instead of figuring it out, we use text file or database to store position of bucket
- In database, table of bucket contain bucket id, position, list of SKU ID, and position of that SKU in the database (good for SKU type A,B,C,D,E)
- In SKU table, it contain SKU id, the number of item lefts, SKU type (high velocity, low velocity for replenishment purpose)
- Orders is are also stored in the form of database or excel.
- In database, order contains SKU ids which is the same as a list of letters. Letters are in the buckets as SKU
- Letter stations is used for replenishment. When it's empty, bucketbot carries bucket to letter stations for replenishment
instead of word stations.
- When bucket is empty the number of 
- A buckets can have more one alphabet (multiple A)
- Bucket is SKU stands
- Pickers is words stations
- Letter stations is 