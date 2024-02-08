create view artist_view as
with artist_albums as
         (select ar.name as "Artist", al.title as "Album", al.albumId
          from artist ar join album al on ar.artistId = al.artistId
         ), tracks_genres as
         (select t.name as "Track", g.name as "Genre", t.albumid
          from track t join genre g on t.genreId = g.genreId)
select a."Artist", a."Album", b."Track", b."Genre"
from artist_albums a join tracks_genres b on a.albumid = b.albumid
