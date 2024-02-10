insert into artist (artistid, "name")
values (1, 'Olga Buzova'),
       (2, 'ATL'),
       (3, 'Miyagi'),
       (4, 'LXST CENTURY'),
       (5, 'DVRST'),
       (6, 'КиШ');

insert into genre(genreid, "name")
values (1, 'Pop'),
       (2, 'Rap'),
       (3, 'Rock'),
       (4, 'Phonk');

insert into mediatype (mediatypeid, "name")
values (1, 'Radio'),
       (2, 'Online');

insert into album (albumid, title, artistid)
values (1, 'Водица', 1),
       (2, 'Лимб', 2),
       (3, 'Buster Keaton', 3),
       (4, 'Radical', 4),
       (5, 'Rays of serenity', 5),
       (6, 'Продавец кошмаров', 6);

insert into track (trackid, name, albumid, mediatypeid, genreid)
values (1, 'Водица', 1, 2,1),
       (2, 'Танцуйте', 2,2,2),
       (3, 'Angel', 3,2,2),
       (4, 'Amnesia', 4, 2, 4),
       (5, 'Rays of serenity', 5,2,4),
       (6, 'Джокер', 6, 2, 3);

insert into playlist (playlistid, name)
values (1, 'Phonk for gym'),
       (2, 'Random tracks'),
       (3, 'My private playlist');

insert into playlisttrack (playlistid, trackid)
values (1, 4),
       (1, 5),
       (2, 2),
       (2, 3),
       (3, 1),
       (3, 6);