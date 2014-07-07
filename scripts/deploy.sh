#!/bin/bash

heroku apps:destroy user-manager-api --confirm
heroku apps:create user-manager-api

git checkout master
git add build_version
git commit -m "update build_version file"

git remote add heroku git@heroku.com:user-manager-api.git
git push heroku master
